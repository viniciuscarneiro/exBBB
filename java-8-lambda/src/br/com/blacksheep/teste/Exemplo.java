package br.com.blacksheep.teste;

import java.util.List;

import br.com.blacksheep.teste.dao.FaturaDAO;
import br.com.blacksheep.teste.email.EnviadorDeEmail;
import br.com.blacksheep.teste.modelo.Fatura;

public class Exemplo {

	public static void main(String[] args) {
		List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();
		EnviadorDeEmail email = new EnviadorDeEmail();

		faturasVencidas.forEach(fv -> email.enviarEmail(fv.getEmailDevedor(), fv.resumo()));
	}

}
