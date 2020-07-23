package br.com.alura.aula1;


import br.com.alura.aula2.Item;
import br.com.alura.aula3.ICPP;
import br.com.alura.aula3.IHIT;
import br.com.alura.aula3.IKCV;

public class TesteDeImpostos {

	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto iccc = new ICCC();
		Imposto ikcv = new IKCV();
		Imposto icpp = new ICPP();
		Imposto ihit = new IHIT();
		
		Orcamento orcamento = new Orcamento(500.00);
		orcamento.adicionar(new Item("CADERNO",15.00));
//		orcamento.adicionar(new Item("CADERNO",15.00));
//		orcamento.adicionar(new Item("CADERNO",15.00));
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
	
		
		
		calculador.realizaCalculo(orcamento, iss);
		calculador.realizaCalculo(orcamento, icms);
		System.out.println(iccc.calcula(orcamento));
		System.out.println(ikcv.calcula(orcamento));
		System.out.println(icpp.calcula(orcamento));
		System.out.println(ihit.calcula(orcamento));
	}

}
