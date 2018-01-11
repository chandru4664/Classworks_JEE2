package com.htc.xml.main;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class RAedXMLusingDoM {
	public static void main(String[] args) {
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		
		DocumentBuilder builder = null;
		Document doc=null;
		try {
			builder=factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			doc=builder.parse("student.xml");
			System.out.println("parsed");
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		NodeList studentList=doc.getElementsByTagName("student");
		for (int i = 0; i <studentList.getLength(); i++) {
			Node studentNode=studentList.item(i);
		if(studentNode.getNodeType()==Node.ELEMENT_NODE)
		{
			Element student=(Element)studentNode;
			String stdno=student.getAttribute("stdno");
NodeList childList=student.getChildNodes();
			for (int j = 0; j < childList.getLength(); j++) {
				Node child=childList.item(j);
				if(child.getNodeType()==Node.ELEMENT_NODE)
				{
					Element StudentchildEle=(Element)child;
					System.out.println("student"+stdno+":"+StudentchildEle.getTagName()+"="+StudentchildEle.getTextContent());
				}
			}
		}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
