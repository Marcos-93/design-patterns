package br.com.alura.aula3;

import br.com.alura.aula1.Imposto;
import br.com.alura.aula1.Orcamento;

public class ICPP extends TemplateImpostoCondicional{

	public ICPP(Imposto outroImposto) {
		super(outroImposto);
	}
	public ICPP() {}
	@Override
	double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()*0.05 + calculoDoOutroImposto(orcamento);
	}

	@Override
	double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07 + calculoDoOutroImposto(orcamento);
	}

	@Override
	boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500.00;
	}

}
