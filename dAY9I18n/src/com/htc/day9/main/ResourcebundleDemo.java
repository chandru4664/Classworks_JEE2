package com.htc.day9.main;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourcebundleDemo {
public static void main(String[] args) {
	ResourceBundle bundle=ResourceBundle.getBundle("Messageresource");
	System.out.println("Hi"+bundle.getString("Greetings"));

Locale l=new Locale("fr","FR");
ResourceBundle bundle1=ResourceBundle.getBundle("Messageresource",l);
System.out.println("Hi"+bundle1.getString("Greetings"));

Locale l1=new Locale("es","ES");
ResourceBundle bundle2=ResourceBundle.getBundle("Messageresource",l1);
System.out.println("Hi"+bundle2.getString("Greetings"));




}
}
