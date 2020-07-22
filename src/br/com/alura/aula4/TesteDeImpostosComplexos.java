package br.com.alura.aula4;

import br.com.alura.aula1.ICMS;
import br.com.alura.aula1.ISS;
import br.com.alura.aula1.Imposto;
import br.com.alura.aula1.Orcamento;
import br.com.alura.aula3.ICPP;

public class TesteDeImpostosComplexos {
	public static void main(String[] args) {
		Imposto iss = new	ISS(new ICMS(new ICPP()));
		
		Orcamento orcamento = new Orcamento(500.00);
		
		double valor = iss.calcula(orcamento);
		System.out.println(valor);
	}
}
