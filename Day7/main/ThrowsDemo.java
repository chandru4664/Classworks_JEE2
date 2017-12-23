package com.htc.Day7.main;

public class ThrowsDemo {
	
	public void A() throws ArithmeticException
	{
		int i=10/0;
	}
	public void B() throws ArithmeticException
	{
		A();
	}
	public void C() throws ArithmeticException
	{
		B();
	}
public static void main(String[] args) {
	
	ThrowsDemo t=new ThrowsDemo();
	try {
	t.C();
	}
	catch(ArithmeticException ae)
	{
		System.out.println(ae);
	}
	System.out.println("end of the program");;
	
	
	
	
	
	
	
	
	
	
	
	
}
}
