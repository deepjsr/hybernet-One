package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class TestUpdateStudent {

	public static void main(String[] args) {
		Student student=new Student();
		student.setName("Sunil Aurora");
		student.setAge(16);
		student.setPhone(90145687952l);
		student.setId(1);
		
		StudentService service= new StudentService();
		int res=service.studentTableUpdate(student);
		if (res>0) {
			System.out.println("Data updated");
		} else {
				System.out.println("Please check the object");
		}
		
	}

}
