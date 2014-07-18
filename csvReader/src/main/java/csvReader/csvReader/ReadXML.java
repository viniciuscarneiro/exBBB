package csvReader.csvReader;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;


public class ReadXML 
{
    public static void main( String[] args )
    {
    	ReadXML obj = new ReadXML();
    	obj.run();
    }

	private void run() {
		
		String xml = "<PostResponse> <Location>http://pocnatura.s3.amazonaws.com/d3f94baa-09df-4e70-a4c6-0cb60c427cc1%2FAmazonistas_0.jpg</Location> <Bucket>pocnatura</Bucket> <Key>d3f94baa-09df-4e70-a4c6-0cb60c427cc1/Amazonistas_0.jpg</Key> <ETag>\"b8177fd64d5be9fc68f22b6a579daa81\" </ETag> </PostResponse>";
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = null;
		try {
		    db = dbf.newDocumentBuilder();
		    InputSource is = new InputSource();
		    is.setCharacterStream(new StringReader(xml));
		    try {
		        Document doc = db.parse(is);
		        String message = doc.getDocumentElement().getTextContent();
		        String[] xmlParsed = message.split(" ");
		        String imageUrl = "Não encontrado";
		        for(int i=0;i<xmlParsed.length;i++) {
		        	if(xmlParsed[i].contains("http://")) {
		        		imageUrl = xmlParsed[i];
		        	}
		        }
		        
		        System.out.println(imageUrl);
		    } catch (SAXException e) {
		        // handle SAXException
		    } catch (IOException e) {
		        // handle IOException
		    }
		} catch (ParserConfigurationException e1) {
		    // handle ParserConfigurationException
		}
	}
}