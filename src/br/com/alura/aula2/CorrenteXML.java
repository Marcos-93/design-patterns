package br.com.alura.aula2;

import java.util.Locale;

public class CorrenteXML implements Corrente {
	private Corrente corrente;
	public String formata(Requisicao requisicao,Conta conta) {
		if(requisicao.getFormato() == Formato.XML) {
			return String.format(Locale.ENGLISH,"<conta>\n  <nome>%s</nome>\n  <saldo>%.2f</saldo>\n</conta>",conta.getNome(),conta.getSaldo());
		}else {
			return this.corrente.formata(requisicao, conta);
		}
	}
	public void setCorrente(Corrente corrente) {
		this.corrente = corrente;
	}
}
