package com.htc.spElemailvalidation.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.htc.spElemailvalidation.model.EmailValidator;



public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		EmailValidator emailValidator = ctx.getBean("emailValidator", EmailValidator.class);
		
		System.out.println(emailValidator.getIsValidEmail());
		((AbstractApplicationContext) ctx).close();

	}

}
