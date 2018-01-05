package com.htc.day9.main;

import java.util.Locale;

public class LocaleDemo {
public static void main(String[] args) {
	Locale l=Locale.GERMAN;
	Locale locale_india=new Locale("ml");
	Locale l1=Locale.getDefault();
	System.out.println(l.getDisplayLanguage());
	System.out.println(l.getVariant());
	
	
	System.out.println(locale_india.getDisplayCountry());
	System.out.println(locale_india.getDisplayLanguage());
	/*Locale locale=new Locale("ta","IN");
			System.out.println(locale.getDisplayLanguage());
	System.out.println(locale.getLanguage());
	System.out.println(locale.getISO3Language());*/
	
/*Locale locale1[]=Locale.getAvailableLocales();
for (int i = 0; i < locale1.length; i++) {
	System.out.println(locale1[i].getDisplayCountry()+"\t"+locale1[i].getCountry()+"\t"+locale1[i].getLanguage());
	
}*/
	
}
}

