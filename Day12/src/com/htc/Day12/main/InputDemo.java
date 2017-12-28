package com.htc.Day12.main;

import java.io.DataInputStream;
import java.io.IOException;

public class InputDemo {
public static void main(String[] args) throws IOException {
	/*int a=System.in.read();
	System.out.println((char)a);*/
	
	DataInputStream din=new DataInputStream(System.in);
	din.readUTF();
}
}
