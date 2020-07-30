package br.com.alura.aula7;

public class NotaFiscalDao implements AcaoAposGerarNota{
	public void executa(NotaFiscal nf) {
		System.out.println("Salvei no banco");
	}
}
