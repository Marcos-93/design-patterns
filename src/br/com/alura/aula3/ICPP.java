package br.com.alura.aula3;

import br.com.alura.aula1.Orcamento;

public class ICPP extends TemplateImpostoCondicional{

	@Override
	double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()*0.05;
	}

	@Override
	double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500.00;
	}

}
