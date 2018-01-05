package com.htc.day9.main;

import java.text.DecimalFormat;
import java.text.ParsePosition;

public class StringtoNumberDemo {
	private static DecimalFormat formatter = new DecimalFormat();

	  public static void main(String[] args) {
	    // Parse a string to decimal number
	    String str = "qp1,234.567";
	    String pattern = "#,###.###";
	    formatter.applyPattern(pattern);

	    // Create a ParsePosition object to specify the first digit of
	    // number in the string. It is 1 in "qq1,234.567"
	    // with the index 2.
	    ParsePosition pp = new ParsePosition(2);

	    Number numberObject = formatter.parse(str, pp);

	    double value = numberObject.doubleValue();
	    System.out.println("Parsed Value  is " + value);
}
}
