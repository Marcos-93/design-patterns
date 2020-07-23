package br.com.alura.aula4;

import java.util.Arrays;

import br.com.alura.aula1.Conta;

public class TesteFiltros {
	public static void main(String[] args) {
	Conta[] contas = {
					new Conta(55.50),
					new Conta(100.00),
					new Conta(200.00),
					new Conta(300.00),
					new Conta(400.00),
					new Conta(500.00),
					new Conta(600.00),
					new Conta(700.00),
					new Conta(800.00),
					new Conta(900.00),
					new Conta(1000.00)};
	
	FiltroMesmoMes filtro = new FiltroMesmoMes(new FiltroMaiorQue500Reais(new FiltroMenorQue100Reais()));
	
	System.out.println(filtro.filtra(Arrays.asList(contas)));
	}
}
