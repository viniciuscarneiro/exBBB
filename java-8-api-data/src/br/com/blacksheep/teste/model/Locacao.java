package br.com.blacksheep.teste.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Locacao {

	private List<Filme> filmes;

	private Cliente cliente;

	private LocalDateTime data;

	private Devolucao devolucao;

	public Locacao(List<Filme> filmes, Cliente cliente) {
		super();
		this.filmes = filmes;
		this.cliente = cliente;
		this.data = LocalDateTime.now();
		this.gerarDevolucao();
	}

	private void gerarDevolucao() {
		this.devolucao = new Devolucao(LocalDateTime.of(calcularDataPrevista(), LocalTime.of(19, 0)));
	}

	private LocalDate calcularDataPrevista() {
		return this.data.plusDays(this.filmes.size()).toLocalDate();
	}

	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Devolucao getDevolucao() {
		return devolucao;
	}

	public void setDevolucao(Devolucao devolucao) {
		this.devolucao = devolucao;
	}

	public void imprimirRecibo() {
		System.out.printf("Obrigado %s. \n", this.cliente.getNome());
		System.out.println("Filme(s):");

		double total = filmes.stream().map(f -> {
			System.out.println(f.getNome());
			return f.getValor();
		}).mapToDouble(BigDecimal::doubleValue).sum();

		System.out.printf("Valor total: R$ %s \n", total);
		System.out.printf("Data da devolucao: %s",
				devolucao.getDataPrevistaDevolucao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
	}

}