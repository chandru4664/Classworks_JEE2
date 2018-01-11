package com.htc.xml.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.swing.text.AbstractDocument.ElementEdit;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class WritingXMLDemo {
	public static void main(String[] args) {
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=null;
		Document doc=null;
		try {
			builder=factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		doc=builder.newDocument();
		Element rootele=doc.createElement("Persons");
		Element personele=doc.createElement("Person");
		Element nameele=doc.createElement("Name");
		Element contactele=doc.createElement("Contact");
		Element emailele=doc.createElement("email");
		
		Text nametxt=doc.createTextNode("Ria");
		Text contacttxt=doc.createTextNode("124563");
		Text emailtxt=doc.createTextNode("Ria@gmail.dom");
		
		nameele.appendChild(nametxt);
		contactele.appendChild(contacttxt);
		emailele.appendChild(emailtxt);
		
		personele.appendChild(nameele);
		
		personele.appendChild(nameele);
		personele.appendChild(contactele);
		personele.appendChild(emailele);
		
		rootele.appendChild(personele);
		doc.appendChild(rootele);
		
		Transformer transformer=null;
		try {
			transformer=TransformerFactory.newInstance().newTransformer();
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerFactoryConfigurationError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		try {
			transformer.transform(new DOMSource(doc), new StreamResult(new FileOutputStream("D:\\person.xml")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println("xm;l created");
		
		
		
	}

}
