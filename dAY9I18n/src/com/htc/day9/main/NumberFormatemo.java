package com.htc.day9.main;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

public class NumberFormatemo {
	public static void main(String[] args) {
		 double mynumber=12345.678;
		    NumberFormat nFormat = null;
		    DecimalFormat dFormat = null;

		    nFormat = NumberFormat.getInstance();
		    if(nFormat instanceof DecimalFormat) {
		    dFormat = (DecimalFormat)nFormat;
		    DecimalFormatSymbols dfs =
		     dFormat.getDecimalFormatSymbols();
		    dfs.setCurrencySymbol("Rs");
		    dFormat.setDecimalFormatSymbols(dfs);
		    dFormat.applyPattern("\u00a4#####000.00####"); 
		   }
		   System.out.println(dFormat.format(mynumber));
	}

}
