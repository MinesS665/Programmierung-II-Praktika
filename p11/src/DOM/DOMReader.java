package DOM;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;

public class DOMReader {
	
	private Document doc;

	public static void main(String[] args) {
		
		DOMReader dr = new DOMReader();
		dr.show(dr.doc.getDocumentElement(),1);

	}
	
	public DOMReader() {
		//Perser-Fabrik bauen
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		//Einrückungen ignorieren
		factory.setIgnoringElementContentWhitespace(true);
		
		try {
			//Tatsächlichen Parser serstellen
			DocumentBuilder builder = factory.newDocumentBuilder();
			doc = builder.parse(new File("src/event.xml"));
			
			System.out.println("Strukturbaum erfolgreich gebaut");
		} catch(ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void show(Node node, int lvl) {
		
		for (int i = 1; i>lvl; i++) {
			System.out.print("	");
		}
		
		System.out.print(node.getNodeName() + "	");
		
		if(node.getNodeValue() != null) System.out.print("= " + node.getNodeValue() + " ");
		
		if(node.hasAttributes()) {
			NamedNodeMap attributes = node.getAttributes();
			for (int i = 0; i<attributes.getLength(); i++) {
				System.out.print(attributes.item(i).getNodeName() + " = " + attributes.item(i).getNodeValue() + " ");
			}
		}
		
		System.out.println();
		
		if (node.hasChildNodes()) {
			lvl++;
			NodeList childs = node.getChildNodes();
			for (int i = 0; i<childs.getLength(); i++) {
				this.show(childs.item(i), lvl);
			}
		} else lvl --;
		
	}
	

}
