package br.com.alura.aula2;

import java.util.List;

import br.com.alura.aula1.Orcamento;

public class DescontoLapisCaneta implements Desconto {
	static List<Item> itens;
	private Desconto proximo;
	@Override
	public double desconta(Orcamento orcamento) {
		DescontoLapisCaneta.itens = orcamento.getItens();
		if(contemItem("CANETA") && contemItem("LAPIS")) {
			return orcamento.getValor()*0.05;
		}else {
			return proximo.desconta(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}
	private boolean contemItem(String nomeDoItem) {
		for(Item item: itens) {
			if(item.getNome().equals(nomeDoItem)) return true;
		}
		return false;
	}
}
