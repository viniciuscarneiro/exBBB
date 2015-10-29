package br.com.blacksheep.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteStream {

	public static void main(String[] args) {
		System.out.println("#### Média de gols ####");
		System.out.println();
		String nome;
		List<Integer> golsPorPartida;
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Informe o jogador: ");
			nome = entrada.nextLine();
			String continuar;
			System.out.println("Deseja continuar (s/n): ");
			continuar = entrada.nextLine();
			int partida = 1;
			golsPorPartida = new ArrayList<>();
			while ("s".equalsIgnoreCase(continuar)) {
				System.out.printf("Quantos gols %s fez na partida %d", nome, partida);
				int golsNaPartida = entrada.nextInt();
				golsPorPartida.add(golsNaPartida);
				partida++;
				System.out.println("Deseja continuar (s/n): ");
				continuar = entrada.nextLine();
			}
		}
		imprimirMediaGols(nome, golsPorPartida);
	}

	private static void imprimirMediaGols(String nome, List<Integer> golsPorPartida) {
		double media = golsPorPartida.stream().mapToDouble(Integer::doubleValue).average().orElse(0);
		System.out.printf("/n O %s fez uma média de %.2f gols por jogo.", nome, media);

	}
}
