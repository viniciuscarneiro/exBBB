package br.com.blacksheep.teste;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalcularIdade {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Digite sua data de nascimento no formato 'dd/mm/aaaa' :");
			String data = scanner.nextLine();
			String[] dataPartida = data.split("/");
			int dia = Integer.valueOf(dataPartida[0]);
			int mes = Integer.valueOf(dataPartida[1]);
			int ano =Integer.valueOf(dataPartida[2]);
			long idade = Period.between(LocalDate.of(ano, mes, dia), LocalDate.now()).getYears();
			System.out.println(String.format("Sua idade %s" ,idade));
		}

	}

}
