package SAX;

import java.io.*;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler{

	private String inhalt = "";
	
	@Override
	public void startDocument() throws SAXException {
		System.out.println("Terminkalender:");
	}
	@Override
	public void endDocument() throws SAXException {
		System.out.println("Ende.");
	}
	
	@Override
	public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException {
		System.out.println(qName + ": ");
		
		System.out.println(qName);
		
		for (int i=0; i<atts.getLength(); i++) {
			System.out.println("- Attribut Nr. " + (i+1) + ": " +atts.getQName(i) + "= " + atts.getValue(i));
			}
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		inhalt = inhalt + new String(ch, start, length);
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) {
		System.out.println("Inhalt von "+qName+": "+inhalt);
		inhalt = "";
		System.out.println("Ende des Elements "+qName);
		System.out.println("");
	}
}
