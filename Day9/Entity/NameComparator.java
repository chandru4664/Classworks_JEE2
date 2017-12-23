package com.htc.Day9.Entity;

import java.util.Comparator;

public class NameComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getProductDesc().compareTo(o2.getProductDesc());
	}

}
