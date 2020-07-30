package br.com.alura.aula5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Conta {
	protected double saldo;
	private final Calendar data;
	protected EstadoDaConta estado;

	public Conta(double saldo) {
		this.saldo = saldo;
		this.estado = new EstadoPositivo();
		this.data = Calendar.getInstance();
	}
	public String depositar(double valor) {
		estado.depositar(this,valor);
		return String.format("Novo saldo: %.2f",getSaldo());
	}
	public String sacar(double valor) {
		estado.sacar(this, valor);
		return String.format("Novo saldo: %.2f",getSaldo());
	}
	public Calendar getData() {
		return data;
	}

	public double getSaldo() {
		return saldo;
	}
	@Override
	public String toString() {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		return String.format("Saldo: %.2f Data: %s\n",getSaldo(),dateFormat.format(getData().getTime()));
	}
}
