package com.htc.xml.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.htc.xml.handler.StudentHandler;

public class ReadindXMLSAX {
	public static void main(String[] args) {
		SAXParserFactory factory=SAXParserFactory.newInstance();
		SAXParser parser=null;
				
				try {
					parser=factory.newSAXParser();
				} catch (ParserConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SAXException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				try {
					parser.parse(new FileInputStream("student.xml"),new StudentHandler() );
					System.out.println("parsed");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SAXException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	}

}
