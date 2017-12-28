package com.htc.Day12.main;

import java.io.Console;

public class ConsoleDemo {
public static void main(String[] args) {
	Console console=System.console();
	System.out.println("Enter the username");
	String uname=console.readLine();
	System.out.println("enter the password");
	String pwd=new String(console.readPassword());
	
	if(pwd.equals("admin@123"))
			{
		System.out.println("valid user");
			}
	else
	{
		System.out.println("Invalid user");
	}
}
}
