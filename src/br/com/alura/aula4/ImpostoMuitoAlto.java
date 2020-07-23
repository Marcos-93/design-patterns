package br.com.alura.aula4;

import br.com.alura.aula1.Imposto;
import br.com.alura.aula1.Orcamento;

public class ImpostoMuitoAlto extends Imposto{

	public ImpostoMuitoAlto(Imposto outroImposto) {
		super(outroImposto);
	}
	public ImpostoMuitoAlto() {}
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor()*0.2 + calculoDoOutroImposto(orcamento) ;
	}

}
