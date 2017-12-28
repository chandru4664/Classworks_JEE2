package com.htc.Day12.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
public static void main(String[] args) throws IOException {
	
	File f=new File("file1.txt");
	
	System.out.println(f.getAbsolutePath());
	System.out.println(f.getParent());
	System.out.println(f.setReadOnly());
	
	FileWriter fw=new FileWriter(f);
	fw.write(" hi hello");
	System.out.println("written into the file");
	fw.close();
}
}
