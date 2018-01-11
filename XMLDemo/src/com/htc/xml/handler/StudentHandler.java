package com.htc.xml.handler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class StudentHandler extends DefaultHandler {

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		System.out.println(new String(ch,start,length));
	}

	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("end of the document");
		
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("</"+qName+">");
	}

	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("reading Documnet");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("<"+qName+">");
	}

	
	
	
}
