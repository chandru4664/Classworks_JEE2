package com.htc.Day7.main;

public class StringDemo {
	public static void main(String[] args) {
		
		
		String s="HTC";
		
	//s="Globa services";
		String s1=new String("HTC");
				String s3="HTC";
		//s=s.concat("Global Services");
		
				if(s.equals(s1))
				{System.out.println("true");
				}
				else
				{
					System.out.println("false");
				}
				
				
				char[] ch=new char[10];
						
				ch=s1.toCharArray();
		System.out.println(ch.length);
		
		System.out.println(s.length());
		System.out.println(s.charAt(1));
		System.out.println(s.codePointAt(2));
		
				
	}

}
