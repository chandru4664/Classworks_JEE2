package com.htc.Day9.Entity;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
public static void main(String[] args) {
	Vector v= new Vector(3,5);
	
	System.out.println(v.size());
	System.out.println(v.capacity()); 
	
	
	v.add(10);
	v.add(90);
	v.add(17);
	System.out.println(v.size());
	System.out.println(v.capacity()); 
	v.add(9);
	v.add(1);
	System.out.println(v.size());
	System.out.println(v.capacity());
	
	Enumeration ele=v.elements();
	while(ele.hasMoreElements())
	{
		System.out.println(ele.nextElement());
	}
}
}
