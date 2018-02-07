package com.htc.spring4.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.htc.spring4.service.AccountJPAService;

public class SpringJPATrMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("jpaanno.xml");
		AccountJPAService accountService = (AccountJPAService) context.getBean("accountService");
		System.out.println(accountService.deposit("M1002", 20000.00));
	}

}
