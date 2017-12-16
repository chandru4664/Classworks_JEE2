package com.htc.day4.entity;

public class OuterClass {
	
	
	private static int age=10;
	
	public void showAge()
	{
		 class InnerClass
		{
			public int getAge()
			{
				return age;
			}
		}
		System.out.println("age is:"+age);
		
		InnerClass inobj=new InnerClass();
		System.out.println(inobj.getAge());		
		
	}
	
	 

}
