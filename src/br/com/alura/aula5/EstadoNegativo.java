package br.com.alura.aula5;

public class EstadoNegativo implements EstadoDaConta{

	@Override
	public void sacar(Conta conta,double valor) {
		throw new RuntimeException("Conta com saldo negativo. Saque negado!");
	}

	@Override
	public void depositar(Conta conta,double valor) {
		conta.saldo += valor *0.95;
		if(conta.saldo > 0) conta.estado = new EstadoPositivo();
	}

}
