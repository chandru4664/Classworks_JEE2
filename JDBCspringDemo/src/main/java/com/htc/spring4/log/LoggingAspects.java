package com.htc.spring4.log;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.MethodBeforeAdvice;

public class LoggingAspects implements MethodBeforeAdvice  {
	long startTime = 0;

	
	public void before(Method method, Object[] params, Object target) throws Throwable {
		
		System.out.println("Class Name: "+target.getClass().getName());
		System.out.println("Method called:" +method.getName());
		System.out.println("Parameters: "+Arrays.toString(params));
		
		startTime=System.currentTimeMillis();
		
	}

}
