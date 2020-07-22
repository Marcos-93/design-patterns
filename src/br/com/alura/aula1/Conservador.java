package br.com.alura.aula1;
public class Conservador implements Investimento {

	@Override
	public double calcula(Conta conta) {
		return conta.getSaldo()*0.008;
	}

}
