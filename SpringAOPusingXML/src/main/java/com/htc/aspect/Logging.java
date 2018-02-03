package com.htc.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


public class Logging {

	
	

	   /** 
	    * This is the method which I would like to execute
	    * before a selected method execution.
	    */
	  
	   public void beforeAdvice(){
	      System.out.println("Going to setup student profile.");
	   }  
	   
	   
	 /*  public void afterAdvice()
	   {
		   System.out.println("task completed");
	   }*/
}
