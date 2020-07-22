package br.com.alura.aula3;

import java.util.Arrays;

import br.com.alura.aula2.Conta;

public class TesteRelatorios {

	public static void main(String[] args) {
		RelatorioSimples simples = new RelatorioSimples();
		RelatorioComplexo complexo = new RelatorioComplexo();

		simples.imprime(Arrays.asList(new Conta("Marcos", 1234,4321,6000.00)));
		complexo.imprime(Arrays.asList(new Conta("Marcos", 1234,4321,6000.00)));
	
	}

}
