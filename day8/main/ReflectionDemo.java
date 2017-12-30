package com.htc.day8.main;

import java.lang.reflect.Method;

public class ReflectionDemo {
public static void main(String[] args) {
	Class<?> c=com.htc.day8.DAO.StudentDAOImpl.class;
	
	Method methods[]=c.getDeclaredMethods();
	for (Method method : methods) {
		
		System.out.println(method.getModifiers()+"\t"+method.getName()+"\t"+method.getParameterCount());
		
	}
	
}
}
