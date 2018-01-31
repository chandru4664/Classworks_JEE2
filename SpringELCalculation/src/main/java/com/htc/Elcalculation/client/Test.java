package com.htc.Elcalculation.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.htc.Elcalculation.model.PerimeterCalculator;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		PerimeterCalculator calculator = ctx.getBean("perimeterCalculator", PerimeterCalculator.class);
		
		System.out.println(calculator.getPerimeter());
		((AbstractApplicationContext) ctx).close();
		

	}

}
