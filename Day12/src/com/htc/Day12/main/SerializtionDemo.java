package com.htc.Day12.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

import com.htc.Day12.entity.Product;

public class SerializtionDemo {
public static void main(String[] args) throws IOException {
	FileOutputStream fout= new FileOutputStream("data.txt");
	ObjectOutputStream obout=new ObjectOutputStream(fout);
	Product product=new Product("p123","pencil",5.04,new Date());
	obout.writeObject(product);
	obout.close();fout.close();
	
}
}
