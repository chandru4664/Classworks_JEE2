package com.htc.Day12.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.htc.Day12.entity.Product;

public class DeSerializationDemo {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	FileInputStream fout= new FileInputStream("data.txt");
	ObjectInputStream obout=new ObjectInputStream(fout);
	Product product=null;
	product=(Product)obout.readObject();
	System.out.println(product);
	
	obout.close();
	fout.close();
}
}
