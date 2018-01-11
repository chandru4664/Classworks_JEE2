package StaxDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class StaxMainDemo {
public static void main(String[] args) {
	XMLInputFactory factory = XMLInputFactory.newFactory();
	try {
		XMLStreamReader reader = factory.createXMLStreamReader(new FileReader("student.xml"));
		
		while(true) {
			int eventType = reader.next();
			if(eventType == XMLStreamConstants.START_DOCUMENT)
					System.out.println("parsing document");
			else if (eventType == XMLStreamConstants.START_ELEMENT) {
				System.out.println(reader.getLocalName() + "  ");
				int attCount = reader.getAttributeCount();
				for(int i=0;i<attCount; i++) {
					System.out.println(reader.getAttributeLocalName(i) +"=" + reader.getAttributeValue(i));
				}
			}
			else if(eventType == XMLStreamConstants.CHARACTERS) {
				System.out.println("  " + reader.getText());
			}		
			else if(eventType == XMLStreamConstants.END_ELEMENT) {
				System.out.println(reader.getLocalName());
			}
			else if(eventType == XMLStreamConstants.END_DOCUMENT){
					System.out.println("parsing completed");
					break;
			}
		}
	}
	 catch (FileNotFoundException | XMLStreamException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
