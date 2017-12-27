package com.htc.Day10.main;

public class StringBufferDemo {
public static void main(String[] args) {
	String s="HTC.GLobal.services";
	String[] strarr=s.split("\\.");
	for (String string : strarr) {
		/*StringBuffer sb=new StringBuffer(s);
		System.out.print(sb.reverse().toString());*/
		System.out.println(string);
	}
	
}
}
