package br.com.blacksheep;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.apache.commons.lang3.StringUtils;

import com.google.common.collect.Maps;

public class XmlReader {

	private HashMap<String, Object> attributesMap;

	public void run() throws FileNotFoundException, XMLStreamException {
		XMLInputFactory inputFactory = XMLInputFactory.newInstance();
		InputStream in = new FileInputStream("/home/vinicius-brito/Desktop/sincronizar.xml");
		XMLStreamReader streamReader = inputFactory.createXMLStreamReader(in);
		attributesMap = Maps.newHashMap();
		readTags(streamReader);
	}

	private void readTags(XMLStreamReader streamReader) throws XMLStreamException {
		while (streamReader.hasNext()) {
			if (streamReader.isStartElement()) {
				agendamento(streamReader);
				bancos(streamReader);
			}
			streamReader.next();
		}

		attributesMap.forEach((key, value) -> {
			System.out.println(key + "=" + value);
		});
	}

	private void buildAttributes(int attributeCount, XMLStreamReader streamReader) {
		for (int i = 0; i < attributeCount; i++) {
			String key = streamReader.getName() + "_" + streamReader.getAttributeLocalName(i);
			attributesMap.put(key.toUpperCase(), streamReader.getAttributeValue(i));
		}
	}

	private void buildAttributesCustomPrefixKey(int attributeCount, XMLStreamReader streamReader, String prefixKey) {
		for (int i = 0; i < attributeCount; i++) {
			String key = prefixKey + "_" + streamReader.getName() + "_" + streamReader.getAttributeLocalName(i);
			attributesMap.put(key.toUpperCase(), streamReader.getAttributeValue(i));
		}
	}

	private void agendamento(XMLStreamReader streamReader) throws XMLStreamException {
		if (StringUtils.equalsIgnoreCase(Tags.AGENDAMENTO.getName(), streamReader.getLocalName())) {
			streamReader.nextTag();
			execucaoInicio(streamReader);
			nextTag(streamReader);
			execucaoIntervalo(streamReader);
		}
	}

	private void execucaoInicio(XMLStreamReader streamReader) {
		if (StringUtils.equalsIgnoreCase(Tags.AGENDAMENTO_EXECUCAO_INICIO.getName(), streamReader.getLocalName())) {
			buildAttributes(streamReader.getAttributeCount(), streamReader);
		}
	}

	private void execucaoIntervalo(XMLStreamReader streamReader) {
		if (StringUtils.equalsIgnoreCase(Tags.AGENDAMENTO_EXECUCAO_INTERVALO.getName(), streamReader.getLocalName())) {
			buildAttributes(streamReader.getAttributeCount(), streamReader);
		}
	}

	private void bancos(XMLStreamReader streamReader) throws XMLStreamException {
		while (StringUtils.equalsIgnoreCase(Tags.BANCO.getName(), streamReader.getLocalName())) {
			String prefixKey = bancoId(streamReader).replaceAll("-", "_");
			streamReader.nextTag();
			databaseTypeEnum(streamReader, prefixKey);
			nextTag(streamReader);
			server(streamReader, prefixKey);
			nextTag(streamReader);
			database(streamReader, prefixKey);
			nextTag(streamReader);
			user(streamReader, prefixKey);
			nextTag(streamReader);
			password(streamReader, prefixKey);
		}
	}

	private String bancoId(XMLStreamReader streamReader) {
		return streamReader.getAttributeValue(0);
	}

	private void databaseTypeEnum(XMLStreamReader streamReader, String prefixKey) {
		if (StringUtils.equalsIgnoreCase(Tags.BANCO_DATABASE_TYPE_ENUM.getName(), streamReader.getLocalName())) {
			buildAttributesCustomPrefixKey(streamReader.getAttributeCount(), streamReader, prefixKey);
		}
	}

	private void server(XMLStreamReader streamReader, String prefixKey) {
		if (StringUtils.equalsIgnoreCase(Tags.BANCO_SERVER.getName(), streamReader.getLocalName())) {
			buildAttributesCustomPrefixKey(streamReader.getAttributeCount(), streamReader, prefixKey);
		}
	}

	private void database(XMLStreamReader streamReader, String prefixKey) {
		if (StringUtils.equalsIgnoreCase(Tags.BANCO_DATABASE.getName(), streamReader.getLocalName())) {
			buildAttributesCustomPrefixKey(streamReader.getAttributeCount(), streamReader, prefixKey);
		}
	}

	private void user(XMLStreamReader streamReader, String prefixKey) {
		if (StringUtils.equalsIgnoreCase(Tags.BANCO_USER.getName(), streamReader.getLocalName())) {
			buildAttributesCustomPrefixKey(streamReader.getAttributeCount(), streamReader, prefixKey);
		}
	}

	private void password(XMLStreamReader streamReader, String prefixKey) {
		if (StringUtils.equalsIgnoreCase(Tags.BANCO_PASSWORD.getName(), streamReader.getLocalName())) {
			buildAttributesCustomPrefixKey(streamReader.getAttributeCount(), streamReader, prefixKey);
		}
	}

	private void nextTag(XMLStreamReader streamReader) throws XMLStreamException {
		streamReader.nextTag();
		streamReader.nextTag();
	}
}
