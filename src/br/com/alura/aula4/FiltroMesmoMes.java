package br.com.alura.aula4;

import java.util.Calendar;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import br.com.alura.aula1.Conta;

public class FiltroMesmoMes extends Filtro{

	public FiltroMesmoMes(Filtro outroFiltro) {
		super(outroFiltro);
	}
	public FiltroMesmoMes() {}
	Predicate<Conta> dateThisMonth = e -> (e.getData().get(Calendar.MONTH) ==  Calendar.getInstance().get(Calendar.MONTH)
			&& e.getData().get(Calendar.YEAR) == Calendar.getInstance().get(Calendar.YEAR));
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> novaLista =contas.stream().filter(dateThisMonth).collect(Collectors.toList());
		novaLista.addAll(proximo(contas));
		return novaLista;
	}

}
