package com.htc.day5.main;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapmain {
public static void main(String[] args) {
	Map<Integer,String> m=new HashMap<>();
	m.put(101, "xxx");
			m.put(102, "yyy");
			m.put(104,"rrr");
			m.put(102, "ttt");
			m.put(99, "totot");
			System.out.println(m.keySet());
			System.out.println(m.values());
			System.out.println(m.entrySet());
}
}
