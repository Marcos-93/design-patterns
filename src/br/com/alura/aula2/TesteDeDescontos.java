package br.com.alura.aula2;

import br.com.alura.aula1.Orcamento;

public class TesteDeDescontos {

	public static void main(String[] args) {
		CalculadorDeDescontos descontos = new CalculadorDeDescontos();
		Orcamento orcamento = new Orcamento(500.00);
		
		orcamento.adicionar(new Item("CANETA",250.00));
		orcamento.adicionar(new Item("LAPIS", 250.00));
		
		double descontoFinal = descontos.calcula(orcamento);
		
		System.out.println(descontoFinal);
		
	}

}
