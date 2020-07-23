package br.com.alura.aula3;

import br.com.alura.aula1.Imposto;
import br.com.alura.aula1.Orcamento;

public abstract class TemplateImpostoCondicional extends Imposto {

	public TemplateImpostoCondicional(Imposto outroImposto) {
		super(outroImposto);
	}
	public TemplateImpostoCondicional() {}
	@Override
	public double calcula(Orcamento orcamento) {
		if(deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		}else {
			return minimaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		}
	}

	abstract double minimaTaxacao(Orcamento orcamento);

	abstract double maximaTaxacao(Orcamento orcamento);

	abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
