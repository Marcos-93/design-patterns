package br.com.alura.aula3;

import java.util.Map;
import java.util.stream.Collectors;

import br.com.alura.aula1.Orcamento;
import br.com.alura.aula2.Item;

public class IHIT extends TemplateImpostoCondicional {
	boolean repete = false;
	@Override
	double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()*0.01*orcamento.getItens().size();
	}

	@Override
	double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()*0.13+100;
	}

	@Override
	boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		Map<String, Long> quantidade = orcamento.getItens().stream().collect(Collectors.groupingBy(Item::getNome,Collectors.counting()));
		quantidade.forEach((n,q)-> repete = q>1?true:false);
		return repete;
	}

}
