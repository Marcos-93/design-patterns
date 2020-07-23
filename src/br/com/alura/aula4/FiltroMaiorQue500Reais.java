package br.com.alura.aula4;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import br.com.alura.aula1.Conta;

public class FiltroMaiorQue500Reais extends Filtro{
	
	public FiltroMaiorQue500Reais(Filtro outroFiltro) {
		super(outroFiltro);
	}
	public FiltroMaiorQue500Reais() {}
	Predicate<Conta> greaterThanFiveHundred = e -> (e.getSaldo() > 500.00);
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> novaLista = contas.stream().filter(greaterThanFiveHundred).sorted(Comparator.comparing(Conta::getSaldo)).collect(Collectors.toList());
		novaLista.addAll(proximo(contas));
		return novaLista;
	}

}
