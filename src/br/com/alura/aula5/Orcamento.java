package br.com.alura.aula5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.aula2.Item;
public class Orcamento {
	
	protected double valor;
	private final List<Item> itens;
	
	protected EstadoDeUmOrcamento estadoAtual;
	
	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<>();
		estadoAtual = new EmAprovacao();
	}
	public void adicionar(Item item) {
		this.itens.add((item));
	}
	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}
	public void aprova() {
		estadoAtual.aprova(this);
	}
	public void reprova() {
		estadoAtual.reprova(this);
	}
	public void finaliza() {
		estadoAtual.finaliza(this);
	}
	
}
