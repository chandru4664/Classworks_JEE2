package com.htc.Day9.Entity;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return new Double(o1.getPrice()).compareTo(new Double(o2.getPrice()));
	}

}
