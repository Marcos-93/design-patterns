package br.com.alura.aula1;

public class CalculadorDeImpostos {
	public void realizaCalculo(Orcamento orcamento,Imposto impostoQualquer) {
		double icms = impostoQualquer.calcula(orcamento);
		System.out.println(icms);
	}
}
