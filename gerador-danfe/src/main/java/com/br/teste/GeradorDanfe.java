package com.br.teste;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import lombok.Cleanup;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRXmlDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

public class GeradorDanfe {

	public static Document getXml(String xml) {
		try {
			/**
			 * Gera um objeto DOM do xml
			 */
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = dbf.newDocumentBuilder();
			FileInputStream fis = new FileInputStream(xml);
			@Cleanup
			InputStream is = fis;
			return docBuilder.parse(is);
		} catch (Exception e) {
			error("Erro ao formatar a string em xml.");
			return null;
		}
	}

	public static Map<String, Object> getFaturas(Document doc) {
		Map<String, Object> map = new HashMap<String, Object>();

		for (int i = 0; i < doc.getElementsByTagName("dup").getLength(); i++) {
			/**
			 * Seta uma duplicata
			 */
			Node dup = doc.getElementsByTagName("dup").item(i);

			/**
			 * Seta o numero
			 */
			Node nDoc = dup.getChildNodes().item(0);
			Node firstChild = nDoc.getFirstChild();
			String numero = null;
			if (firstChild != null) {
				numero = firstChild.getNodeValue();
			}
			map.put("FAT_NUMERO" + (i + 1), numero);

			/**
			 * Seta a data
			 */
			Node nData = dup.getChildNodes().item(1);
			String data = nData.getFirstChild().getNodeValue();

			try {
				map.put("FAT_VENCIMENTO" + (i + 1), new SimpleDateFormat("yyyy-MM-dd").parse(data));
			} catch (Exception e) {
				map.put("FAT_VENCIMENTO" + (i + 1), null);

			}

			/**
			 * Seta o valor
			 */
			Node nValor = dup.getChildNodes().item(2);
			Node firstChild2 = nValor.getFirstChild();
			String valor = null;
			if (firstChild != null) {
				valor = firstChild2.getNodeValue();
				map.put("FAT_VALOR" + (i + 1), Double.parseDouble(valor != null ? valor : "0"));
			}
		}
		return map;
	}

	public byte[] getDanfe(String xml, String logo) {
		byte[] pdf = null;
		try {
			/**
			 * Documento XML.
			 */
			Document doc = getXml(xml);
			
			//URL jasper = getClass().getResource("/relatorios/danfeR2.jasper");
			URL jrxml = getClass().getResource("/relatorios/danfeR2.jrxml");
			info("Lendo arquivo jasper: " + jrxml.getPath());
			
			String urlDanfe = jrxml.getPath();
			File f = new File(urlDanfe);
            JasperDesign jasperDesign = JRXmlLoader.load(f);    
            JasperReport jasperCompilado = JasperCompileManager.compileReport(jasperDesign);  
  

			/**
			 * Fonte de Dados.
			 */
			JRXmlDataSource ds = new JRXmlDataSource(doc, "/nfeProc/NFe/infNFe/det");

			/**
			 * Parametros
			 */
			Map<String, Object> param = getFaturas(doc);
			param.put("Logo", logo);

			/**
			 * Gerando o relatorio
			 */
			JasperPrint print = JasperFillManager.fillReport(jasperCompilado, param, ds);

			/**
			 * Exportando em pdf
			 */
			pdf = JasperExportManager.exportReportToPdf(print);
		} catch (Exception e) {
			error(e.toString());
			pdf = null;
		}
		return pdf;
	}

	/**
	 * Log ERROR.
	 * 
	 * @param error
	 */
	private static void error(String error) {
		System.out.println("| ERROR: " + error);
	}

	/**
	 * Log INFO.
	 * 
	 * @param info
	 */
	private static void info(String info) {
		System.out.println("| INFO: " + info);
	}

}
