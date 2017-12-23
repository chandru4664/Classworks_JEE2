package com.htc.Day9.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.htc.Day9.Entity.Product;
import com.htc.Day9.Entity.ProductNotFoundException;
import com.htc.Day9.Entity.ProductServiceproviderImpl;

public class CrudDemo {
	public static void main(String[] args) {
		ProductServiceproviderImpl service=new ProductServiceproviderImpl();
				
				
				
		System.out.println(service.add(new Product("p123","pen",10.45,new Date())));
		System.out.println(service.add(new Product("p167","pencil",5.45,new Date())));
		System.out.println(service.add(new Product("p15","Eracer",3.45,new Date())));
		System.out.println(service.add(new Product("p183","ruler",20.45,new Date())));
		try {
			System.out.println(service.getProductById("p12"));
		} catch (ProductNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		
		
	}

}
