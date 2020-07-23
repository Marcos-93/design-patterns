package br.com.alura.aula1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Conta {
	private double saldo;
	private final Calendar data;

	public Conta(double saldo) {
		this.saldo = saldo;
		this.data = Calendar.getInstance();
	}
	
	public Calendar getData() {
		return data;
	}

	public double getSaldo() {
		return saldo;
	}
	public void adiciona(double valor) {
		this.saldo += valor;
	}
	@Override
	public String toString() {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		return String.format("Saldo: %.2f Data: %s\n",getSaldo(),dateFormat.format(getData().getTime()));
	}
}
