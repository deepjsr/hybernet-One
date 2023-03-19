package com.jsp.controller;

import com.jsp.service.StudentService;

public class TestStudentTable {

	public static void main(String[] args) {
		StudentService service = new StudentService();
		 String res=service.studentTableCreate();
		 if (res!=null) {
			System.out.println(res);
		}
		
	}
}
