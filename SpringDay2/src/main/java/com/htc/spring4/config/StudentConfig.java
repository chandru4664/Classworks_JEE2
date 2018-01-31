package com.htc.spring4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.htc.spring4.beans.Address;
import com.htc.spring4.beans.College;
import com.htc.spring4.beans.Student;

@Configuration
public class StudentConfig {
	
	
	
	@Bean(name="address")
	public Address getAddress() {
		
		Address add = new Address();
		add.setDoorno("5");
		add.setCity("Karur");
		add.setStreet("Market Street");
		add.setPincode("636549");
		return add;
		
	}
	
	@Bean(name="college")
	public College getCollege() {
		
		College col = new College();
		col.setCollegeName("SNS");
		col.setCollegeAddress("Coiambatore");
		return col;
	}
	
	@Bean(name="student")
	public Student getStudent() {
		Student student = new Student();
		student.setStudentName("Abi");
		student.setRegno("VIV53");
		student.setAddress(getAddress());
		student.setCollege(getCollege());
		return student;
	}
}
