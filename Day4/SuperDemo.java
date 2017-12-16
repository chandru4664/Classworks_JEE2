package com.htc.day3.main;

import com.htc.day2.entity.Surgeon;

public class SuperDemo {
public static void main(String[] args) {
	Surgeon s=new Surgeon("xxx");
	System.out.println(s.treatPatient());
	System.out.println(s.incision());
	System.out.println(s.getA());
	
	
}
}
