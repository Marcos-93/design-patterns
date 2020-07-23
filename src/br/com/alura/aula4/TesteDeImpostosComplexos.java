package br.com.alura.aula4;

import br.com.alura.aula1.ICMS;
import br.com.alura.aula1.ISS;
import br.com.alura.aula1.Imposto;
import br.com.alura.aula1.Orcamento;
import br.com.alura.aula3.ICPP;
import br.com.alura.aula3.IKCV;

public class TesteDeImpostosComplexos {
	public static void main(String[] args) {
		Imposto iss = new ISS(new ICMS(new ImpostoMuitoAlto(new ICPP())));
		
		Imposto icpp = new ICPP(new IKCV());
		Orcamento orcamento = new Orcamento(500.00);
		
		double valor = iss.calcula(orcamento);
		double novoValor = icpp.calcula(orcamento);
		
		System.out.println(valor);
		System.out.println(novoValor);
	}
}
