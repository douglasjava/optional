package com.algaworks.teste;

import com.algaworks.model.Caminhao;
import com.algaworks.model.Motorista;
import com.algaworks.model.Seguro;
import com.algaworks.repository.Motoristas;

public class ConsultaCobertura {

	public static void main(String[] args) {
		Motoristas motoristas = new Motoristas();
		
		String cobertura = motoristas.porNome("José")
								.flatMap(Motorista::getCaminhao)
								.flatMap(Caminhao::getSeguro)
								.map(Seguro::getCobertura)
								.orElse("Sem cobertura");
		
		System.out.println("A cobertura é: " + cobertura);
	}
	
}















