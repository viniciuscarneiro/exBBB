package br.com.blacksheep.teste.email;

public class EnviadorDeEmail {

	public void enviarEmail(String to, String texto) {
		System.out.printf("Enviando e-mail para [%s], O texto [%s] \n", to, texto);
	}
}
