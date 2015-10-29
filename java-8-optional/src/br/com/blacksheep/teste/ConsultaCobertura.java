package br.com.blacksheep.teste;

import br.com.blacksheep.model.Caminhao;
import br.com.blacksheep.model.Motorista;
import br.com.blacksheep.model.Seguro;
import br.com.blacksheep.repository.Motoristas;

public class ConsultaCobertura {

	public static void main(String[] args) {
		Motoristas motoristas = new Motoristas();

		String cobertura = motoristas.porNome("João")
									.flatMap(Motorista::getCaminhao)
									.flatMap(Caminhao::getSeguro)
									.map(Seguro::getCobertura)
									.orElse("Sem cobertura");
		
		System.out.println(new StringBuilder().append("A cobertura é: ").append(cobertura));
	}
}
