package com.htc.day3.main;

import com.htc.day2.entity.Doctor;
import com.htc.day2.entity.Surgeon;

public class OvverideDemo {
	
	public static void main(String[] args) {
		
		Surgeon d=(Surgeon) new Doctor();//Up-casting
		Doctor doctor=new Surgeon();//downcasting
		Surgeon surgeon=new Surgeon();
		System.out.println(d.treatPatient());
		
		
	}

}
