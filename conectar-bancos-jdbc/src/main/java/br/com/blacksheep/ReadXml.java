package br.com.blacksheep;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.apache.commons.lang3.StringUtils;

public class ReadXml {

	public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
		XMLInputFactory inputFactory = XMLInputFactory.newInstance();
		InputStream in = new FileInputStream("/home/vinicius-brito/Desktop/sincronizar.xml");
		XMLStreamReader streamReader = inputFactory.createXMLStreamReader(in);
		streamReader.nextTag(); // Advance to "sincronizacao" element
		streamReader.nextTag(); // Advance to "agendamento" element
		agendamento(streamReader);
		banco(streamReader);
	}

	private static void agendamento(XMLStreamReader streamReader) throws XMLStreamException {
		if (StringUtils.equalsIgnoreCase("agendamento", streamReader.getLocalName()) && streamReader.isStartElement()) {
			streamReader.nextTag();
			execucaoInicio(streamReader);
			// sai da tag execucaoInicio e vai para execucaoIntervalo
			streamReader.nextTag();
			streamReader.nextTag();
			execucaoIntervalo(streamReader);
			// sai da tag execucaoIntervalo e vai para banco
			streamReader.nextTag();
			streamReader.nextTag();
			streamReader.nextTag();
		}
	}

	private static void execucaoInicio(XMLStreamReader streamReader) throws XMLStreamException {
		if (StringUtils.equalsIgnoreCase("execucaoInicio", streamReader.getLocalName()) && streamReader.isStartElement()) {
			System.out.println(streamReader.getAttributeName(0));
			System.out.println(streamReader.getAttributeName(1));
		}
	}

	private static void execucaoIntervalo(XMLStreamReader streamReader) throws XMLStreamException {
		if (StringUtils.equalsIgnoreCase("execucaoIntervalo", streamReader.getLocalName()) && streamReader.isStartElement()) {
			System.out.println(streamReader.getAttributeName(0));
			System.out.println(streamReader.getAttributeName(1));
		}
	}

	private static void banco(XMLStreamReader streamReader) throws XMLStreamException {
		if (StringUtils.equalsIgnoreCase("banco", streamReader.getLocalName()) && streamReader.isStartElement()) {
			System.out.println(streamReader.getAttributeName(0));

		}
	}
}
