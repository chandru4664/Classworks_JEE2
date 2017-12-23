package com.htc.Day9.main;

import java.util.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import com.htc.Day9.Entity.NameComparator;
import com.htc.Day9.Entity.PriceComparator;
import com.htc.Day9.Entity.Product;

public class ProductLisst {
public static void main(String[] args) {
	List<Product> products=new ArrayList<>();
	products.add(new Product("p123","pen",10.45,new Date()));
	products.add(new Product("p167","pencil",5.45,new Date()));
	products.add(new Product("p15","Eracer",3.45,new Date()));
	products.add(new Product("p183","ruler",20.45,new Date()));
	
	//Collections.sort(products);
	
	System.out.println("sorted list based on name");
	Collections.sort(products, new NameComparator());
	
	for (Product product : products) {
		System.out.println(product);
	}
	
	System.out.println("sorted list based on price");
	Collections.sort(products, new PriceComparator());
	
	for (Product product : products) {
		System.out.println(product);
	}
	
	/*ListIterator<Product> list=products.listIterator();
	
	while(list.hasNext());
	{
		Product p=list.next();
	}
	
	
	System.out.println("decending order");
	
	while(list.hasPrevious())
	{
		System.out.println(list.previous());
	}
	*/
	
}
}
