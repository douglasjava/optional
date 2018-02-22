package com.algaworks.teste;

import java.math.BigDecimal;
import java.util.Optional;

import com.algaworks.model.Seguro;

public class TesteOptional {

	public static void main(String[] args) {
		Seguro seguro = new Seguro("Total com franquia reduzida", new BigDecimal("600"));
		Optional<Seguro> seguroOptional = Optional.ofNullable(seguro); //ofNullable -> caso n�o tenha certeza se o objeto venha preenchido

		seguroOptional.map(Seguro::getValorFranquia).ifPresent(System.out::println);
	}
	
}
