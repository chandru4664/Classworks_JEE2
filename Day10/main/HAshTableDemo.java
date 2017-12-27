package com.htc.Day10.main;

import java.util.Hashtable;

public class HAshTableDemo {
	public static void main(String[] args) {
		Hashtable<String,Integer> table=new Hashtable<>();
		
		table.put("pen",10);
		table.put("pen",20);
		//table.put("pen",null);//nullpointerException
		table.put(null, 10);
		System.out.println(table);
		
		
		
	}

}
