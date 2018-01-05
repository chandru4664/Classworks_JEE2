package com.htc.day9.main;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {
	public static void main(String[] args) {
	    double value = 123456789.9876543;

	    // Default locale
	    printFormatted(Locale.ITALIAN, value);

	    // Indian locale
	    Locale indianLocale = new Locale("en", "IN");
	    printFormatted(indianLocale, value);
	  }

	  public static void printFormatted(Locale locale, double value) {
	    // Get number and currency formatter
	    NumberFormat nf = NumberFormat.getInstance(locale);
	    NumberFormat cf = NumberFormat.getCurrencyInstance(locale);

	    System.out.println("Format value: " + value + "  for locale: " + locale);
	    System.out.println("Number: " + nf.format(value));
	    System.out.println("Currency: " + cf.format(value));
	  }
}
