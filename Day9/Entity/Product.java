package com.htc.Day9.Entity;

import java.util.Date;

public class Product implements Cloneable,Comparable<Product> {
private String productid;
private String productDesc;
private double price;
private Date mgfDate;


public String getProductid() {
	return productid;
}
public Product(String productid, String productDesc, double price, Date mgfDate) {
	super();
	this.productid = productid;
	this.productDesc = productDesc;
	this.price = price;
	this.mgfDate = mgfDate;
}
public void setProductid(String productid) {
	this.productid = productid;
}
public String getProductDesc() {
	return productDesc;
}
public void setProductDesc(String productDesc) {
	this.productDesc = productDesc;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Date getMgfDate() {
	return mgfDate;
}
public void setMgfDate(Date mgfDate) {
	this.mgfDate = mgfDate;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Product [productid=" + productid + ", productDesc=" + productDesc + ", price=" + price + ", mgfDate="
			+ mgfDate + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((mgfDate == null) ? 0 : mgfDate.hashCode());
	long temp;
	temp = Double.doubleToLongBits(price);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((productDesc == null) ? 0 : productDesc.hashCode());
	result = prime * result + ((productid == null) ? 0 : productid.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Product other = (Product) obj;
	if (mgfDate == null) {
		if (other.mgfDate != null)
			return false;
	} else if (!mgfDate.equals(other.mgfDate))
		return false;
	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
		return false;
	if (productDesc == null) {
		if (other.productDesc != null)
			return false;
	} else if (!productDesc.equals(other.productDesc))
		return false;
	if (productid == null) {
		if (other.productid != null)
			return false;
	} else if (!productid.equals(other.productid))
		return false;
	return true;
}


public Object clone() throws CloneNotSupportedException 
{
return super.clone();	
}
@Override
public int compareTo(Product o) {
	
	
	//return new Double(this.price).compareTo(new Double(o.getPrice()));
	
	return this.productDesc.compareTo(o.getProductDesc());
}





}
