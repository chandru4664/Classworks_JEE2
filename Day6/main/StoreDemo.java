package com.htc.Day6.main;

import java.util.Date;

import com.htc.Day6.entity.Product;
import com.htc.Day6.entity.Store;

//HAS-A relationship Demo
public class StoreDemo {
public static void main(String[] args) {
	Store ABCStore=new Store("p123","ABC Store",null);
	
	Product products[]= {new Product("p123","pen",20.50,new Date()),
			             new Product("p145","pencil",5.60,new Date()),
			             new Product("p345","ruler",25.50,new Date())
	};
	
	ABCStore.setProducts(products);
	System.out.println("store id"+ABCStore.getStoreid());
	System.out.println("store Description"+ABCStore.getStoreDesc());
	System.out.println("productid\tproductDescription\tprice");
	
	for (int i = 0; i < ABCStore.getProducts().length; i++) {
	
		System.out.println(products[i].getProductid()+"\t\t"+products[i].getProductDesc()+"\t\t"+products[i].getPrice());
	}
		
	}







	

}
