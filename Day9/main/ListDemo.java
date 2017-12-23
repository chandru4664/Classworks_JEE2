package com.htc.Day9.main;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
public static void main(String[] args) {
	
/*	List<Integer> l=new ArrayList<>();
	List<Integer> CopyList=new ArrayList<>();
	
	CopyList.add(89);
	CopyList.add(56);
	l.add(90);
	l.add(45);
	l.add(10);
	l.add(2);
	l.remove(new Integer(2));
	l.add(2, 67);
	//CopyList.addAll(l);
	CopyList.addAll(1, l);
	Collections.sort(l);
	
	//System.out.println(l);
	
	Iterator i=l.iterator();
	while(i.hasNext())
	{
		int value=(Integer)i.next()+20;
		System.out.println(value);
	}
	
	System.out.println("using for loop");
	for (Integer integer : CopyList) {
		System.out.println(integer);
		
	}*/
	
	List<Integer> l=new ArrayList<>();
	
	
	l.add(90);
	l.add(45);
	l.add(10);
	l.add(2);
	
	
	Collections.sort(l);
	System.out.println(l);
	
	
	
}
}
