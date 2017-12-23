package com.htc.Day7.main;

public class WrapperDemo {
	public static void main(String[] args) {
		int i=10;
		Integer intobj=new Integer(i);//Boxing
		
		int d=intobj.intValue();//UnBoxing
		System.out.println(intobj.MAX_VALUE);
		
		
		int x=90;
		
		Integer xobj=x;//AutoBoxing
		
		int changevalue=xobj;//AutoUnboxing
		
		
		double dvalue=Double.parseDouble("67.90");
		System.out.println(intobj.intValue());
		System.out.println(intobj.doubleValue());
		System.out.println(intobj.byteValue());
		System.out.println(intobj.longValue());
		System.out.println(intobj);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
