package br.com.blacksheep.teste.controller;

import java.time.format.DateTimeFormatter;

import br.com.blacksheep.teste.repository.Filmes;

public class ListarTodosFilmes {

	public static void main(String[] args) {
		System.out.printf("%-30s %s\n", "Nome:", "Data de lançamento:");
		Filmes filmes = new Filmes();
		filmes.todos().forEach(f -> {
			System.out.printf("%-30s %s\n", f.getNome(), f.getDataLancamento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm")));
		});
	}
}
