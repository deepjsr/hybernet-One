package com.jsp.demo;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestEMF {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("god");
	System.out.println(entityManagerFactory);

}
}
