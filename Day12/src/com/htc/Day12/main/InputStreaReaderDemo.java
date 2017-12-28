package com.htc.Day12.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreaReaderDemo {
public static void main(String[] args) throws IOException {
	BufferedReader inr=new BufferedReader(new InputStreamReader(System.in));
	/*int a=inr.read();
	
	while(a!=-1)
	{
		System.out.print((char)a);
		a=inr.read();
		
	}*/
	String str=inr.readLine();
	int age=Integer.parseInt(inr.readLine());
	System.out.println("name is"+str);
	System.out.println("age is"+age);
	
}
}
