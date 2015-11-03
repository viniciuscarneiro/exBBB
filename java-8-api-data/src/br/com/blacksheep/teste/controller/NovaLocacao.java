package br.com.blacksheep.teste.controller;

import java.util.Arrays;
import java.util.List;

import br.com.blacksheep.teste.model.Cliente;
import br.com.blacksheep.teste.model.Filme;
import br.com.blacksheep.teste.model.Locacao;
import br.com.blacksheep.teste.repository.Filmes;

public class NovaLocacao {

	public static void main(String[] args) {
		Filmes filmes = new Filmes();
		List<Filme> filmesAlugados = Arrays.asList(filmes.porCodigo(0),filmes.porCodigo(2));
		Locacao locacao = new Locacao(filmesAlugados, new Cliente("João Souza"));
		locacao.imprimirRecibo();
	}
}
