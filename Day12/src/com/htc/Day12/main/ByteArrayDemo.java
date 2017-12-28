package com.htc.Day12.main;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayDemo {
public static void main(String[] args) throws IOException {
	ByteArrayOutputStream bout=new ByteArrayOutputStream();
	String str="this is my first sample code to expleain IO";
	bout.write(str.getBytes());
	
	bout.writeTo(new FileOutputStream("a1.txt"));
	bout.writeTo(new FileOutputStream("a2.txt"));
	bout.writeTo(new FileOutputStream("a3.txt"));
	
	bout.flush();bout.close();
	
	
	
}
}
