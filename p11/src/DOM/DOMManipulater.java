package DOM;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class DOMManipulater {
	public static void main(String[] args) {
		try {
			File xmlFile = new File("src/event.xml");
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setIgnoringElementContentWhitespace(true);
			DocumentBuilder builder = factory.newDocumentBuilder();
			
			Document tree;
			Element rootElement;
			
			if(xmlFile.exists()) {
				tree = builder.parse(xmlFile);
				rootElement = tree.getDocumentElement();
				System.out.println("Bestehende XML geladen. Füge Daten hinzu...");
			} else {
                // WENN SIE NICHT EXISTIERT: Neues Dokument und neues Root-Element erstellen
                tree = builder.newDocument();
                rootElement = tree.createElement("plan");
                tree.appendChild(rootElement);
                System.out.println("Datei nicht gefunden. Erstelle neue XML...");
            }
			
			//neue Veranstaltung erstellen
			
			//1. nächste ID ermitteln
			NodeList currEvents = rootElement.getElementsByTagName("event");
			int nextID = currEvents.getLength() + 1;
			// Formatieren zu "04", "05" etc. (mit führender Null bei einstelligen Zahlen)
            String newID = String.format("%02d", nextID);
            
            //2. neues Event erstellen
            Element newEvent = tree.createElement("event");
            newEvent.setAttribute("id", newID);
            
            //3. Weitere Attribute einfügen
            Element title = tree.createElement("title");
            title.setTextContent("Krypto");
            newEvent.appendChild(title);
            
            Element organisator = tree.createElement("organisator");
            organisator.setTextContent("Prof. Wichtig");
            newEvent.appendChild(organisator);
            
            Element date = tree.createElement("date");
            date.setTextContent("01.07.26");
            newEvent.appendChild(date);
            
            Element place = tree.createElement("place");
            place.setTextContent("HSZ 301");
            newEvent.appendChild(place);
            
            Element time = tree.createElement("time");
            time.setTextContent("16:00");
            newEvent.appendChild(time);
            
            Element guests = tree.createElement("guests");
            guests.setTextContent("90");
            newEvent.appendChild(guests);
            
            Element category = tree.createElement("category");
            category.setTextContent("Vorlesung");
            newEvent.appendChild(category);
            
            Element typ = tree.createElement("typ");
            typ.setTextContent("Präsenz"); 
            newEvent.appendChild(typ);
            
            rootElement.appendChild(newEvent);
            
            //In Datei speichern
            DOMSource source = new DOMSource(tree);
            StreamResult res = new StreamResult(xmlFile);
            
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            
            //Damit die DOCTYPE-Zeile (<!DOCTYPE plan SYSTEM "events.dtd">) nicht gelöscht wird:
            if (tree.getDoctype() != null) {
                String systemId = tree.getDoctype().getSystemId();
                transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, systemId);
            }
            
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4"); // Nutzt Tabs für den Einzug wie dein Original
            
            transformer.transform(source, res);
            System.out.println("Event erfolgreich mit ID " + newID + " hinzugefügt!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
