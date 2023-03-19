package com.jsp.service;

import java.util.List;

import com.jsp.dao.CreateStudentDao;
import com.jsp.dto.Student;

public class StudentService {
	CreateStudentDao crdb=new CreateStudentDao();

	public String studentTableCreate() {
		return crdb.createTable();
	}
	
	public int studentSave(Student student) {
		return crdb.saveStudent(student);
	}
	
	public int studentTableUpdate(Student student) {
		return crdb.studentUpdate(student);
	}
	
	public int studentTableDelete1(int id) {
		return crdb.studentDelete(id);
	}
	public Student getStudentById(int id) {
		return crdb.getStudentById(id);
	}
	public List<Student> getAllstudent() {
		return crdb.getAllStudent();
	}

}
