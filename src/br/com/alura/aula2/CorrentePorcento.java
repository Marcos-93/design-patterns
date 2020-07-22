package br.com.alura.aula2;

import java.util.Locale;

public class CorrentePorcento implements Corrente {

	private Corrente corrente;

	@Override
	public String formata(Requisicao requisicao, Conta conta) {
		if(requisicao.getFormato() == Formato.PORCENTO) {
			return String.format(Locale.ENGLISH,"%s%s%.2f",conta.getNome(),"%",conta.getSaldo());
		}else {
			return corrente.formata(requisicao, conta);
		}
	}

	@Override
	public void setCorrente(Corrente corrente) {
		this.corrente = corrente;
	}

}
