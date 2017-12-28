package com.htc.Day12.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileHandlingDemo {
public static void main(String[] args) throws IOException {
	/*FileOutputStream fout=new FileOutputStream("D:\\onsit training\\javageneratedfiles\\out.txt",true);
	
	fout.write(("IO stream \n ".getBytes()));
	fout.write((" important chapter ".getBytes()));
	fout.flush();
	fout.close();*/
	
	
	BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("out.txt")));
	int character;
	System.out.println("reading string from file");
	/*while((character=fin.read())!=-1)
	{
		System.out.print((char)character);
	}
	*/
	
	System.out.println(br.readLine());
}


}
