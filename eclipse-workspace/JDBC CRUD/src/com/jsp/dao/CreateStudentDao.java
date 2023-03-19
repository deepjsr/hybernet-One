package com.jsp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jsp.dto.Student;


public class CreateStudentDao {
	public String createTable() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud","root","root@123jS");
			//create a statement
			Statement statement=connection.createStatement();
			//execute the statement
			statement.execute("create table student(id int primary key,name varchar(60),age int,phone bigint(10))");
			System.out.println("table created");
			connection.close();
			return "Table created";
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public int saveStudent(Student student) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud","root","root@123jS");
			PreparedStatement preparedStatement=connection.prepareStatement("insert into student values (?,?,?,?)");
			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setInt(3, student.getAge());;
			preparedStatement.setLong(4, student.getPhone());
				int	res=preparedStatement.executeUpdate();
				connection.close();
				return res;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return 0;
	}
	public int studentUpdate(Student student) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud","root","root@123jS");
		PreparedStatement preparedStatement=connection.prepareStatement("update	student set name=?,age=?,phone=? where id=?");
		preparedStatement.setString(1,student.getName());
		preparedStatement.setInt(2, student.getAge());;
		preparedStatement.setLong(3, student.getPhone());
		preparedStatement.setInt(4, student.getId());
			int	res=preparedStatement.executeUpdate();
			connection.close();
			return res;
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return 0;
	}
	public int studentDelete(int id) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud","root","root@123jS");
		PreparedStatement pre=connection.prepareStatement("delete from student where id=?");
		pre.setInt(1, id);
		int	res=pre.executeUpdate();
		connection.close();
		return res;

	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return 0;
}
	public Student getStudentById( int id) {
		Student student= new Student();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud","root","root@123jS");
			PreparedStatement pre=connection.prepareStatement("select * from student where id=?");
			pre.setInt(1, id);
			ResultSet resset=pre.executeQuery();
			while (resset.next()) {
				
				int id1=resset.getInt(1);
				String name=resset.getString(2);
				int age=resset.getInt(3);
				long phone=resset.getLong(4);
				
				student.setId(id1);
				student.setName(name);
				student.setAge(age);
				student.setPhone(phone);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
	}
	public List<Student> getAllStudent() {
		List<Student> list=new ArrayList<Student>();
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud","root","root@123jS");
			Statement statement=connection.createStatement();				
			ResultSet resultset=statement.executeQuery("select * from student");
			while (resultset.next()) {
				Student student=new Student();
				student.setId(resultset.getInt(1));
				student.setName(resultset.getString(2));
				student.setAge(resultset.getInt(3));
				student.setPhone(resultset.getLong(4));
				
				list.add(student);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
}
