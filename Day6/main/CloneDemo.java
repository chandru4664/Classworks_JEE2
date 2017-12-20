package com.htc.Day6.main;

import java.util.Date;

import com.htc.Day6.entity.Product;

public class CloneDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Product product1=new Product("p001","Eraser",5.50,new Date());
		Product product2=(Product) product1.clone();
		
		System.out.println(product1);
		System.out.println(product2);
	}

}
