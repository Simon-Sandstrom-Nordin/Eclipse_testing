package Eclipse_testing.labb5;

import org.w3c.dom.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.xml.parsers.*;
import java.io.*;

public class XMLTreeParser {

	public static DefaultMutableTreeNode parseXML() {	// alternate constructor if no argument is passed
		String fileName = "Liv.xml";
		return parseXML(fileName);
	}
	
    public static DefaultMutableTreeNode parseXML(String fileName) {
       
        try {
            File xmlFile = new File("src/Eclipse_testing/labb5/" + fileName); // Adjust the path accordingly
            
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlFile);

            DefaultMutableTreeNode root = parseXML(doc.getDocumentElement());
            return root;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }	// fråga inte varför inte alla kommentarer e på svenska <3

    private static DefaultMutableTreeNode parseXML(Element element) {	// "Element"? Är ej familjär med org.w3c.dom modulen...
        DefaultMutableTreeNode node = new DefaultMutableTreeNode(getNodeDetails(element));

        NodeList children = element.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);	// item har med hur Nodelist är dokumenterad...
            if (child.getNodeType() == Node.ELEMENT_NODE) {
                DefaultMutableTreeNode childNode = parseXML((Element) child);	// den funkar, men förstår ej... rekursion
                node.add(childNode);	// lägger rekursivt in alla childnodes
            }
        }

        return node;
    }

    protected static NodeDetails getNodeDetails(Element element) {
        String name = element.getAttribute("namn");
        String text = element.getTextContent().trim();

        return new NodeDetails(name, text);
    }

    static class NodeDetails {
        String name;
        String text;

        NodeDetails(String name, String text) {
            this.name = name;
            this.text = text;
        }
    }
    
}

// ... ja alltså strukturn blev ok, men infon blev heybaberiba. 
