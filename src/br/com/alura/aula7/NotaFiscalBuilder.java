package br.com.alura.aula7;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {
	private String razaoSocial;
	private String cnjp;
	private List<ItemDaNota> todosItens = new ArrayList<>();
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private Calendar data;
	private List<AcaoAposGerarNota> todasAcoesASeremExecutadas;
	public NotaFiscalBuilder() {
		this.todasAcoesASeremExecutadas = new ArrayList<>();
	}
	public void adicionaAcao(AcaoAposGerarNota acao) {
		this.todasAcoesASeremExecutadas.add(acao);
	}
	
	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}
	
	public NotaFiscalBuilder comCnpj(String cnjp) {
		this.cnjp = cnjp;
		return this;
	}
	public NotaFiscalBuilder comItem(ItemDaNota item) {
		this.todosItens.add(item);
		this.valorBruto = todosItens.stream().mapToDouble(ItemDaNota::getValor).reduce(0,(v1,v2) -> v1 + v2);
		this.impostos = this.valorBruto*0.05;
		return this;
	}
	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}
	public NotaFiscalBuilder naDataAtual() {
		this.data = Calendar.getInstance();
		return this;
	}
	public NotaFiscalBuilder naData(Calendar novaData) {
		data = novaData;
		return this;
	}
	public NotaFiscal constroi() {
		NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnjp, data, valorBruto, impostos, todosItens, observacoes);
		this.todasAcoesASeremExecutadas.forEach(acao -> acao.executa(notaFiscal));
		
		
		return notaFiscal;
	}

}
