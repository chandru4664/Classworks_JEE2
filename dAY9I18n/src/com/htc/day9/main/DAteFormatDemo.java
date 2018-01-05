package com.htc.day9.main;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DAteFormatDemo {
	public DAteFormatDemo() {
	// TODO Auto-generated constructor stub
}
	public static void main(String[] args) {
	
		
		DateFormat df=DateFormat.getDateInstance(DateFormat.LONG, new Locale("es","ES"));
		Date d=new Date();
		System.out.println(df.format(d));
		
		DateFormat df1=DateFormat.getTimeInstance(DateFormat.SHORT,Locale.ITALY);
		System.out.println(df1.format(d));
}
}
