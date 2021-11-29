import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class xmltest {

	public static void main(String[] args) {

		InputStream istream;
		String nodename = null;
		String categoryText = "";
		try {
			istream = new FileInputStream("C:\\Users\\Siddharth\\Documents\\OFFICE\\json\\parsexml.xml");
			XMLInputFactory xif = XMLInputFactory.newFactory();
			XMLStreamReader xsf = xif.createXMLStreamReader(istream);
			while (xsf.hasNext()) {
				int event = xsf.next();
				switch (event) {
				case XMLStreamConstants.START_ELEMENT:
					nodename = xsf.getLocalName();
					System.out.println(nodename);
					
					if (nodename.equals("book")) {
						 String language = xsf.getAttributeValue(null, "language");
						 System.out.println(language);
					}  
					
					break;
				case XMLStreamConstants.CHARACTERS:

					if (nodename != null && nodename.equals("author")) {
						categoryText = xsf.getText();
						System.out.println(categoryText);
					}
					if (nodename != null && nodename.equals("title")) {
						categoryText = xsf.getText();
						System.out.println(categoryText); 
					}
					if (nodename != null && nodename.equals("category")) {
						categoryText = xsf.getText();
						System.out.println(categoryText);
					}
					if (nodename != null && nodename.equals("year")) {
						categoryText = xsf.getText();
						System.out.println(categoryText);
					} 

					break;
				case XMLStreamConstants.END_DOCUMENT:
					System.out.println(nodename);
				}
			} 
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}