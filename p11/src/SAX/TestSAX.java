package SAX;

import javax.xml.parsers.*;

import org.xml.sax.SAXException;

public class TestSAX {
	
	public TestSAX() {
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			
			System.out.println("Reader: " + saxParser.getXMLReader().toString());
			MyHandler handler = new MyHandler();
			saxParser.parse("src/event.xml", handler);
		} catch (SAXException e) {
			System.out.println("SAX-Fehler: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unbekannter Fehler: " + e.getMessage());
		}
	}
	public static void main(String[] args) {
		
		new TestSAX();

	}

	
}
