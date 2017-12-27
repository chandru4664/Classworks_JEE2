package com.htc.Day10.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateDemo {
public static void main(String[] args) throws ParseException {
	Scanner s=new Scanner(System.in);
	/*Date d=new Date();
	System.out.println(d);*/
	SimpleDateFormat si=new SimpleDateFormat("dd-MM-yyyy");
	//System.out.println(si.format(d));
	Date userdate=si.parse(s.next());
System.out.println(si.format(userdate));
	
	Calendar c=new GregorianCalendar();
	c.setTime(userdate);
	System.out.println(c.get(Calendar.YEAR));
	System.out.println(c.get(Calendar.MONTH)+1);
	System.out.println(c.get(Calendar.DAY_OF_MONTH));
	//System.out.println(Calendar.YEAR+"-"+Calendar.MONTH+"-"+Calendar.DAY_OF_MONTH);
}
}
