import java.io.BufferedReader;
import java.io.FileReader;


public class XmlParse {

	public static void main(String[] args) {
		try {
			BufferedReader xmlReader = new BufferedReader(new FileReader("E:\\jsonfiles\\sampleXML"));
			String data;
			StringBuffer response = new StringBuffer();


			while ((data = xmlReader.readLine()) != null) {
				response.append(data);
			}
			xmlReader.close();

			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
