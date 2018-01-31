package com.htc.spring4.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.htc.spring4.beans.Student;

public class SpringDepInTest {
		public static void main(String[] args) {
			
			ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
			Student student = (Student) context.getBean("student");
			
			System.out.println(student.getStudentName());
			System.out.println(student.getRegno());
			System.out.println(student.getAddress());
			System.out.println(student.getCollege());
			
		}
}
