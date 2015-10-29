package com.br.teste;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestarRelatorio {

	private static GeradorDanfe geradorDanfe;

	public static void main(String[] args) {
		try {
			geradorDanfe = new GeradorDanfe();
			String fileXML = "/home/vinicius-brito/Downloads/Nfe-exemplos/51150402247671000187550010000380081570071951-nfe.xml"; //
			// "/home/diego/Downloads/anexos/51150402247671000187550010000378121618568097-nfe.xml"; //
			// "/home/diego/Downloads/anexos/51150402247671000187550010000378131204023700-nfe.xml"; //
			// "/home/diego/Downloads/anexos/51150402247671000187550010000378151555515279-nfe.xml"; //
			// "/home/diego/Downloads/anexos/51150402247671000187550010000378151555515279-nfe.xml"; String xml = lerXML(fileXML);
			String logo = "";

			byte[] pdf = geradorDanfe.getDanfe(fileXML, logo);

			// preciso retornar o caminho absoluto do pdf criado
			String nomeArquivo = System.getProperty("java.io.tmpdir") + File.separator + "danfe.pdf";

			FileOutputStream fos = new FileOutputStream(nomeArquivo);
			fos.write(pdf);
			fos.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public static String lerXML(String fileXML) throws IOException {
		String linha = "";
		StringBuilder xml = new StringBuilder();

		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileXML)));
		while ((linha = in.readLine()) != null) {
			xml.append(linha);
		}
		in.close();

		return xml.toString();
	}
}
