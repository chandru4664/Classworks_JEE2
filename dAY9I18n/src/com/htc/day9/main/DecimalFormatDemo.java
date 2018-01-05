package com.htc.day9.main;

import java.text.DecimalFormat;

public class DecimalFormatDemo {
	 private static DecimalFormat formatter = new DecimalFormat();

	  public static void main(String[] args) {
	    formatNumber("##.##", 12.345);
	    formatNumber("##.##", 12.345);
	    formatNumber("0000.0000", 12.345);
	    formatNumber("#.##", -12.345);

	    // Positive and negative number format 
	    formatNumber("#.##;(#.##)", -12.735);
	  }

	  public static void formatNumber(String pattern, double value) {
	    // Apply the pattern formatter.applyPattern ( pattern );

	    String formattedNumber = formatter.format(value);

	    System.out.println("Number:" + value + ", Pattern:" + pattern
	        + ", Formatted Number:" + formattedNumber);
	  }
}
