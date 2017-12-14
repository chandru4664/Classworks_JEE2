package com.htc.day3.main;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
public static void main(String[] args) {
	int[] values;
	
	values=new int[5];
	
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter 5 nos");
	for (int i = 0; i <values.length; i++) {
		values[i]=s.nextInt();
		
		
	}
	
	/*for (int i : values)//enhanced for loop -java 7
	{
		i=i+3;
	System.out.println(i);
	
	}*/
	Arrays.sort(values);
	
	System.out.println("sorted set");
	for (int i : values) {
		System.out.println(i);
	}
	
	
	
}
}
