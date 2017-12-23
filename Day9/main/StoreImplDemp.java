package com.htc.Day9.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.htc.Day9.Entity.Product;
import com.htc.Day9.Entity.Store;

public class StoreImplDemp {
public static void main(String[] args) {
	Store ABCstore=new Store("s123","ABCstore",null);
	
	List<Product> products=new ArrayList<>();
	products.add(new Product("p123","pen",10.45,new Date()));
	products.add(new Product("p167","pencil",5.45,new Date()));
	products.add(new Product("p15","Eracer",3.45,new Date()));
	products.add(new Product("p183","ruler",20.45,new Date()));
	
	
	ABCstore.setProducts(products);
	
	
	System.out.println(ABCstore);
}
}
