package com.htc.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.htc.model.Student;

public class AOPMainapp {
	 public static void main(String[] args) {
	      ApplicationContext context = 
	         new ClassPathXmlApplicationContext("spring-config.xml");

	      Student student = (Student) context.getBean("student");

	      student.getName();
	      student.getAge();
	      student.setName("priya");
	      student.getName();
}
}
