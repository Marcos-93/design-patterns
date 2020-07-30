package br.com.alura.aula5;

public interface EstadoDaConta {
	void sacar(Conta conta,double valor);
	void depositar(Conta conta,double valor);
}
