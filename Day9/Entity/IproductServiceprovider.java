package com.htc.Day9.Entity;

import java.util.List;

public interface IproductServiceprovider {
boolean add(Product product);
Product getProductById(String productId) throws ProductNotFoundException;
List<Product> getProducts();
boolean updateprice(String productId,double price) throws ProductNotFoundException;
boolean deleteProduct(String productId) throws ProductNotFoundException;


}

