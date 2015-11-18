package br.com.blacksheep;

import java.io.FileNotFoundException;

import javax.xml.stream.XMLStreamException;

public class ReadXml {

	public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
		XmlReader reader = new XmlReader();
		reader.run();
	}

}
