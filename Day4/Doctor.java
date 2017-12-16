package com.htc.day2.entity;

public  class Doctor {
	final int a=10;
	public Doctor(String name)
	{
		System.out.println("Doctor dsefault constructor"+name);
	}
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public  String treatPatient()
	{
		return "doctors treat patient";
	}

}
