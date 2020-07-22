package br.com.alura.aula2;

public class Conta {
	private final String nome;
	private final double saldo;
	private final int agencia;
	private final int numero;

	public Conta(String nome,int numero,int agencia,double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.nome = nome;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}
	
}
