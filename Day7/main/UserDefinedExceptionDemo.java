package com.htc.Day7.main;

import java.util.Scanner;

import com.htc.Day7.Enitity.AgeNotVAlidException;

public class UserDefinedExceptionDemo {
	
void checkAge() throws AgeNotVAlidException
{
	int age;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the age");
	age=scan.nextInt();
	if(age<=18)
	{
		throw new AgeNotVAlidException("the given age is not valid");
	}
	
	System.out.println("age is:"+age);
}

public static void main(String[] args) {
	UserDefinedExceptionDemo exception=new UserDefinedExceptionDemo();
	try {
		exception.checkAge();
	} catch (AgeNotVAlidException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	
	
	System.out.println("end of the program");
	
	
	
	
	
	
	
	
	
	
	
	
}
}
