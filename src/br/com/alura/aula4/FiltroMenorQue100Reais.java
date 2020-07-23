package br.com.alura.aula4;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import br.com.alura.aula1.Conta;

public class FiltroMenorQue100Reais extends Filtro {

	public FiltroMenorQue100Reais(Filtro outroFiltro) {
		super(outroFiltro);
	}
	public FiltroMenorQue100Reais() {}
	
	Predicate<Conta> menorQueCem = e -> (e.getSaldo() < 100);
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> novaLista = contas.stream().filter(menorQueCem).collect(Collectors.toList());
		novaLista.addAll(proximo(contas));
		return novaLista;
	}

}
