package com.jsp.controller;

import com.jsp.service.StudentService;

public class TestDeleteStudent {

	public static void main(String[] args) {
		StudentService service=new StudentService();
		int res= service.studentTableDelete1(1);
		if (res>0) {
			System.out.println("Data Deleted");
		}else {
			System.out.println("please check the id");
		}
		
		
	}

}
