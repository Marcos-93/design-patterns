package br.com.alura.aula1;

import java.util.Random;

public class Moderado implements Investimento {

	@Override
	public double calcula(Conta conta) {
		boolean chance = new Random().nextBoolean();
		if(chance) {
			return conta.getSaldo()*0.025;
		}else {
			return conta.getSaldo()*0.007;
		}
	}
	
}
