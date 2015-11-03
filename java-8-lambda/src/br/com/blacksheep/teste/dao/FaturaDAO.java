package br.com.blacksheep.teste.dao;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import br.com.blacksheep.teste.modelo.Fatura;

public class FaturaDAO {

	public List<Fatura> buscarFaturasVencidas() {

		Fatura f1 = new Fatura("joao@joo.com.br", 350.00, LocalDate.now().minusDays(3));
		Fatura f2 = new Fatura("maria@joo.com.br", 150.00, LocalDate.now().minusMonths((2)).minusDays(2));
		Fatura f3 = new Fatura("jose@joo.com.br", 200.00, LocalDate.now().minusDays(5));
		return Arrays.asList(f1, f2, f3);
	}
}
