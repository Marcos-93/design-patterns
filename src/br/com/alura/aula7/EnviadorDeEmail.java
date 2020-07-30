package br.com.alura.aula7;

public class EnviadorDeEmail implements AcaoAposGerarNota{
	public void executa(NotaFiscal nf) {
		System.out.println("Enviei por email");
	}
}
