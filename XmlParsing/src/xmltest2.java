
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class xmltest2 {
	public static void main(String[] args) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();

			Document document = builder.parse(new File("C:\\Users\\Siddharth\\Documents\\OFFICE\\json\\parsexml.xml"));
			document.getDocumentElement().normalize();

			Element root = document.getDocumentElement();
			System.out.println(root.getNodeName());

			NodeList nList = document.getElementsByTagName("book");

			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node node = nList.item(temp);  	
				
                
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					 
					Element eElement = (Element) node; 
					
					
					System.out.println("enter the element:");
					System.out.println(eElement.getNodeName());
					System.out.println("Language:"+eElement.getAttribute("language"));
					System.out.println("Authors:"+eElement.getElementsByTagName("authors").item(0).getTextContent());
					System.out.println("Title:"+eElement.getElementsByTagName("title").item(0).getTextContent());
					System.out.println("Category:"+eElement.getElementsByTagName("category").item(0).getTextContent());
					System.out.println("Year:"+eElement.getElementsByTagName("year").item(0).getTextContent());
					System.out.println("Enter the element"); 
					
				}
			}
		} catch (ParserConfigurationException | SAXException | IOException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}