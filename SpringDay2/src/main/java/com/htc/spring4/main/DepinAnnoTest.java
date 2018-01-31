package com.htc.spring4.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.htc.spring4.beans.Student;
import com.htc.spring4.config.StudentConfig;

public class DepinAnnoTest {

	public static void main(String[] args) {
			
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		Student student = (Student) context.getBean("student");
		
		System.out.println(student.getStudentName());
		System.out.println(student.getRegno());
		System.out.println(student.getAddress());
		System.out.println(student.getCollege());

	}

}


