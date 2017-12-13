package com.htc.day2.main;

import java.util.Scanner;

public class ForDemo {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int no,sum=0;
	for(int i=1;i<=5;i++)
	{
		no=s.nextInt();
		if(no<0)
		{
			continue;
		}
		sum=sum+no;
	}
	System.out.println("sum value"+sum);
		
}
}
