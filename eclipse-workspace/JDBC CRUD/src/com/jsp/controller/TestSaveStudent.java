package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class TestSaveStudent {
	public static void main(String[] args) {
		
		Student student=new Student();
		student.setId(3);
		student.setName("Nagendra Bhoumik");
		student.setAge(26);
		student.setPhone(988008759l);
		
		StudentService service= new StudentService();
		int res=service.studentSave(student);
		if (res>0) {
			System.out.println("Data saved");
		} else {
				System.out.println("Please check the object");
		}
		
	}
}
