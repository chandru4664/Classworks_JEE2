package com.htc.xml.parser;

import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public class BooksErrorHandler extends DefaultHandler{

	@Override
	public void error(SAXParseException e) throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("Error");
		System.out.println("Line number:" + e.getLineNumber());
		System.out.println("Message:" + e.getMessage());
	}

	@Override
	public void fatalError(SAXParseException e) throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("Fatal Error");
		System.out.println("Line number:" + e.getLineNumber());
		System.out.println("Message:" + e.getMessage());

	}

	@Override
	public void warning(SAXParseException e) throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("Warning");
		System.out.println("Line number:" + e.getLineNumber());
		System.out.println("Message:" + e.getMessage());

	}

	
}
