package com.htc.Day6.entity;

import java.util.Arrays;

public class Store {
	private String storeid;
	private String storeDesc;
	private Product[] products;
	public String getStoreid() {
		return storeid;
	}
	public void setStoreid(String storeid) {
		this.storeid = storeid;
	}
	public String getStoreDesc() {
		return storeDesc;
	}
	public void setStoreDesc(String storeDesc) {
		this.storeDesc = storeDesc;
	}
	public Product[] getProducts() {
		return products;
	}
	public void setProducts(Product[] products) {
		this.products = products;
	}
	public Store(String storeid, String storeDesc, Product[] products) {
		super();
		this.storeid = storeid;
		this.storeDesc = storeDesc;
		this.products = products;
	}
	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(products);
		result = prime * result + ((storeDesc == null) ? 0 : storeDesc.hashCode());
		result = prime * result + ((storeid == null) ? 0 : storeid.hashCode());
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
		Store other = (Store) obj;
		if (!Arrays.equals(products, other.products))
			return false;
		if (storeDesc == null) {
			if (other.storeDesc != null)
				return false;
		} else if (!storeDesc.equals(other.storeDesc))
			return false;
		if (storeid == null) {
			if (other.storeid != null)
				return false;
		} else if (!storeid.equals(other.storeid))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Store [storeid=" + storeid + ", storeDesc=" + storeDesc + ", products=" + Arrays.toString(products)
				+ "]";
	}
	
	
	
	

}
