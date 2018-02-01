package com.htc.spring4.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.htc.spring4.beans.Product;
import com.htc.spring4.dao.ProductDAO;




public class ProductJDBCMain {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("Product.xml");
	ProductDAO prod = (ProductDAO) context.getBean("dao");
	
	prod.addProduct(new Product("PR18","SamsungMobile",800,11500,"CT02"));
	//System.out.println(prod.updateProduct("PR16", 9000, 600));
	//System.out.println(prod.getProduct("PR16"));
	/*for(Product p : prod.getProducts("CT03") ) {
	System.out.println(p);
	}*/

}
}
