package br.com.alura.aula1;

public class ICCC implements Imposto{
	@Override
	public double calcula(Orcamento orcamento) {
		double saldo = orcamento.getValor();
		if(saldo < 1000.00) {
			return saldo*0.05;
		}else if(saldo <= 3000) {
			return saldo*0.07;
		}else {
			return saldo*0.08 + 30;
		}
	}
	
}
