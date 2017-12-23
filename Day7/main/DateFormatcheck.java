package com.htc.Day7.main;

import java.util.Date;

public class DateFormatcheck {
public static void main(String[] args) {
	//Date d=new Date();
	String date="12/201/2017";
	
	if(date.matches("\\d{2}/\\d{2}/\\d{4}") )
	{
		System.out.println("valid format");
	}
	else
	{
		System.out.println("Invalid format");
	}
	
	
			 
}
}
