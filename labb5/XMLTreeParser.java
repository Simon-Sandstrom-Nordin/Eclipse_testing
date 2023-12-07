package Eclipse_testing.labb5;

import org.w3c.dom.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.xml.parsers.*;
import java.io.*;

public class XMLTreeParser {

	public static DefaultMutableTreeNode parseXML() {
		String fileName = "Liv.xml";	// default file name, if no argument is passed
		return parseXML(fileName);
	}
	
    public static DefaultMutableTreeNode parseXML(String fileName) {
       
        try {
            File xmlFile = new File("src/Eclipse_testing/labb5/" + fileName);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlFile);
            DefaultMutableTreeNode root = parseXML(doc.getDocumentElement());
            return root;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public static DefaultMutableTreeNode parseXML(Element element) {
        DefaultMutableTreeNode node = new DefaultMutableTreeNode(getNodeDetails(element));
        NodeList children = element.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            if (child.getNodeType() == Node.ELEMENT_NODE) {
                DefaultMutableTreeNode childNode = parseXML((Element) child);
                node.add(childNode);
            }
        }
        return node;
    }

    private static String getFirstLineTextContent(Element element) {
        String textContent = element.getTextContent().trim();
        String[] lines = textContent.split("\n");
        if (lines.length > 0) {
            return lines[0].trim();
        } else {
            return textContent;
        }
    }

    public static NodeDetails getNodeDetails(Element element) {
    	String level = element.getNodeName();
        String name = element.getAttribute("namn");
        String text = getFirstLineTextContent(element).trim();
        
        return new NodeDetails(level, name, text);
    }

    public static class NodeDetails {
    	String level;
        String name;
        String text;
        
        @Override
        public String toString() {
        	return getName();
        }
        
        private String getName() {
        	return name;
        }
        
        public String getInfo() {
        	return level + ": " + name + " " + text;
        }
        
        NodeDetails(String level, String name, String text) {
        	this.level = level;
        	this.name = name;
            this.text = text;
        }
    }
    
}
