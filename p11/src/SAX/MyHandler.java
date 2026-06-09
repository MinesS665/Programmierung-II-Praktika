package SAX;

import java.io.*;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler{

	private String curTag = "";
	private String title;
	private String organisator;
	private int guests;
	private int aEvents = 0;
	
	@Override
	public void startDocument() throws SAXException {
		System.out.println("Terminkalender:");
	}
	@Override
	public void endDocument() throws SAXException {
		System.out.println("Ende.");
	}
	
	@Override
	public void startElement(String stringURI, String localName, String qName, Attributes atts) throws SAXException {
		
		curTag = qName;
		
		if("event".equals(qName)) {
			title = "";
			organisator = "";
			guests = 0;
		}
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		
		String tmp = new String(ch, start, length).trim();
		
		if (curTag.isEmpty()) return;
		
		switch (curTag) {
		case "title": title += tmp; break;
		case "organisator": organisator += tmp; break;
		case "guests":
			try {
				guests = Integer.parseInt(tmp);
			} catch (NumberFormatException e) {
				guests = 0;
			}
			break;
		}
		
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) {
		
		if ("event".equals(qName)) {
			aEvents++;
			
			System.out.println(title + ", " + organisator + ", Anzahl Gäste: " + guests);
			
			curTag = "";
		}

	}
}
