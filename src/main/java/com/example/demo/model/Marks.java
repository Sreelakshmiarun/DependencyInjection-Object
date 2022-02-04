package com.example.demo.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Marks {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		System.out.println("application File is Loaded");
		Student stu = context.getBean("student",Student.class);
		stu.stu();
		
		Arunstudent arun = context.getBean("arunStudent",Arunstudent.class);
		arun.arunStudent();
		
	}

}
