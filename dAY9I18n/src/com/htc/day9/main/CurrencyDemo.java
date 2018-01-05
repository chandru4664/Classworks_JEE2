package com.htc.day9.main;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyDemo {
public static void main(String[] args) {
	double d=12367.890;
	NumberFormat nfmt=NumberFormat.getCurrencyInstance(Locale.CANADA);
	System.out.println(nfmt.format(d));
}
}
