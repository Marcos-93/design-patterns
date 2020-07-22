package br.com.alura.aula3;

import br.com.alura.aula1.Orcamento;
import br.com.alura.aula2.Item;

public class IKCV extends TemplateImpostoCondicional{

	@Override
	double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()*0.06;
	}

	@Override
	double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()*0.10;
	}

	@Override
	boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500.00 && temItemMaior100ReaisNo(orcamento);
	}

	private boolean temItemMaior100ReaisNo(Orcamento orcamento) {
		for(Item item: orcamento.getItens())
			if(item.getValor() > 100) return true;
		return false;
	}

}
