package com.htc.Day7.main;

import java.io.IOException;

public class SimpletryDemo {
	
	
	int divideNo(int x,int y) throws ArithmeticException,IOException
	{
	return x/y;	
	}
	
	
	
	
public static void main(String[] args) {
	
	SimpletryDemo s=new SimpletryDemo();
	
	try
	{
	try {
		System.out.println(s.divideNo(10, 0));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	catch(ArithmeticException ae)
	{
		System.out.println(ae);
	}
	
	System.out.println("end of program");
	
	
	
	
	
	
	
	
	
}
}