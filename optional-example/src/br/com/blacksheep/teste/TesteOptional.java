package br.com.blacksheep.teste;

import java.math.BigDecimal;
import java.util.Optional;

import br.com.blacksheep.model.Seguro;

public class TesteOptional {

	public static void main(String[] args) {
		Seguro seguro = new Seguro("Total com franquia reduzida", BigDecimal.valueOf(600));
		Optional<Seguro> seguroOptional = Optional.ofNullable(seguro);
		seguroOptional.map(Seguro::getValorFranquia).ifPresent(System.out::println);
	}
}
