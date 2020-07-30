package br.com.alura.aula7;

public class EnviadorDeSms implements AcaoAposGerarNota{
	public void executa(NotaFiscal nf) {
		System.out.println("Enviei por sms");
	}
}
