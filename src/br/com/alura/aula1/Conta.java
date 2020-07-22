package br.com.alura.aula1;

public class Conta {
	private double saldo;

	public Conta(double saldo) {
		this.saldo = saldo;
		
	}
	public double getSaldo() {
		return saldo;
	}
	public void adiciona(double valor) {
		this.saldo += valor;
	}
}
