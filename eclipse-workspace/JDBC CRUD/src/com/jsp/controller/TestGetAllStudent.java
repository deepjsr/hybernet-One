package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class TestGetAllStudent {

	public static void main(String[] args) {
		// get All student data from Database
		StudentService service= new StudentService();
		List<Student> list=service.getAllstudent();
		if (list.size()>0) {
			for (Student student : list) {
				System.out.println(student.getId());
				System.out.println(student.getName());
				System.out.println(student.getAge());
				System.out.println(student.getPhone());
				System.out.println("--------------------");
			}
		}

	}

}
