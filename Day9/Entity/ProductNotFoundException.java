package com.htc.Day9.Entity;

public class ProductNotFoundException extends Exception{

	String message;
	public ProductNotFoundException() {
		this.message="given product id is invalid";
	}
	
	
	public ProductNotFoundException(String message) {
		this.message=message;
	}


	@Override
	public String toString() {
		return "ProductNotFoundException [message=" + message + "]";
	}
	
	@Override
	public String getMessage() {
		
		return this.message;
	}
	
	
}
