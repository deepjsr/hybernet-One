package com.jsp.controller;


import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class TestGetStudentById {

	public static void main(String[] args) {
		
		StudentService service=new StudentService();
	Student	allStuentById=service.getStudentById(2);
	System.out.println(allStuentById.getId());
	System.out.println(allStuentById.getName());
	System.out.println(allStuentById.getAge());
	System.out.println(allStuentById.getPhone());
		
	}

}
