package com.htc.day4.main;

import com.htc.day4.entity.OuterClass;
import com.htc.day4.entity.OuterClass.InnerClass;

public class innerclassDemo {
public static void main(String[] args) {
	
	
	OuterClass out=new OuterClass();
	out.showAge();
	//InnerClass inobj=out.new InnerClass();// non static innerclass
	//InnerClass inobj=new OuterClass.InnerClass();//static innerclass
	//System.out.println(inobj.getAge());
	
}
}
