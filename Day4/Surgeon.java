package com.htc.day2.entity;

public class Surgeon extends Doctor{
	
	 int ab;
	public Surgeon()
	{
		
	}
	public Surgeon(String name)
	{
		
		super("yyy");
		//a=90;//shows compile time error  final variable can't be reassigned
		System.out.println("Surgeon dsefault constructor"+name);
		
	}
	public String treatPatient()
	{
		System.out.println(super.treatPatient());
		return "Surgeon treat patient";
		
	}
	
	
	public int getA()
	{
		System.out.println(super.a);
		return a;
	}
	
	public String incision()
	{
	return "surgeons operate patients";
	}

}
