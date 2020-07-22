package br.com.alura.aula1;

public class TesteInvestimento {

	public static void main(String[] args) {
		Conta conta1 = new Conta(200);
		RealizadorDeInvestimentos investimentos = new RealizadorDeInvestimentos();
		Arrojado arrojado = new Arrojado();
		Conservador conservador = new Conservador();
		Moderado moderado = new Moderado();
		
		investimentos.executa(conta1, moderado);
		investimentos.executa(conta1, conservador);
		investimentos.executa(conta1, arrojado);
		
		
	}

}
