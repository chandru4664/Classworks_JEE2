package com.htc.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {

	
	@Pointcut("execution(* com.htc.model.*.set*(..))")
	   private void selectAll(){}

	   /** 
	    * This is the method which I would like to execute
	    * before a selected method execution.
	    */
	   @Before("selectAll()")
	   public void beforeAdvice(){
	      System.out.println("Going to setup student profile.");
	   }  
	   
	   @After("execution(* com.htc.model.*.*(..))")
	   public void afterAdvice()
	   {
		   System.out.println("task completed");
	   }
}
