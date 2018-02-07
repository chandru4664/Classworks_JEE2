package com.htc.spring4.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.htc.spring4.config.JPAConfig;
import com.htc.spring4.service.AccountJPAService;

public class SpringJPATrAnnoTestMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JPAConfig.class);
		AccountJPAService accountService = (AccountJPAService) context.getBean("accountService");
		System.out.println(accountService.deposit("M1002", 20000.00));
		

}
}
