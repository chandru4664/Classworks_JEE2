package com.htc.Day10.main;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<>();
		m.put("xxx",90);
		m.put("yyy", null);
		m.put("zzz", null);
		m.put(null, 89);
		m.put(null, 78);
		m.put("yyy", 78);
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		for(Map.Entry<String,Integer> entry:m.entrySet())
	
		{
			System.out.print(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		
	}

}
