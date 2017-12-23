package com.htc.Day9.Entity;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceproviderImpl implements IproductServiceprovider {

	List<Product> productList=new ArrayList<>();
	@Override
	public boolean add(Product product) {
		boolean flag=false;
		
		productList.add(product);
		flag=true;
		
		return flag;
	}

	@Override
	public Product getProductById(String productId) throws ProductNotFoundException {
		Product productresult=null;
		boolean flag=false;
		for (Product product : productList) {
			
			if(product.getProductid().equals(productId))
					{
				productresult=product;
				flag=true;
					}
			
		}
		
		if(!flag)
		{
			throw new ProductNotFoundException("Product id not found in the list");
		}
		
		return productresult;
	}

	@Override
	public List<Product> getProducts() {
		
		return productList;
	}

	@Override
	public boolean updateprice(String productId, double price) throws ProductNotFoundException {
		boolean flag=false;
/*for (Product product : productList) {
			
			if(product.getProductid().equals(productId))
					{
				
				product.setPrice(price);
				flag=true;
				break;
					}
			
		}*/
		
		Product product=getProductById(productId);
		product.setPrice(price);
		
		flag=true;
		
		return flag;
	}

	@Override
	public boolean deleteProduct(String productId) throws ProductNotFoundException {
		boolean flag=false;
		for (Product product : productList) {
					
					if(product.getProductid().equals(productId))
							{
						
						productList.remove(product);
							}
					
				}
				
				
				
				return flag;
			}
	

}
