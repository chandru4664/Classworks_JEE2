package com.htc.logicaloperator.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.htc.logicaloperator.model.ExaminationResult;



public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		ExaminationResult bean = ctx.getBean("examinationResult", ExaminationResult.class);
		
		System.out.println(bean.getResultMessage());
		System.out.println(bean.getHasPassed());
		((AbstractApplicationContext) ctx).close();
		
	}
}
