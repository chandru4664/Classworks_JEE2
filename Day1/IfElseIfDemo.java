package com.htc.Day1.main;

import java.util.Scanner;

public class IfElseIfDemo {
	 public static void main( String[] args )  
	    {  
	        int age;
	        Scanner inputDevice = new Scanner( System.in );  
	        System.out.print( "Please enter Age: " );  
	       age = inputDevice.nextInt();
	        if ( age >= 18 && age <=35 )  
	            System.out.println( "between 18-35 " );  
	        else if(age >35 && age <=60)  
	            System.out.println("between 36-60");  
	        else  
	            System.out.println( "not matched" );  
	    }   
}
