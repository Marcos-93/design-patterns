package br.com.alura.aula7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class NotaFiscal {
	private String razaoSocial;
	private String cnjp;
	private Calendar datDeEmissao;
	private double valorBruto;
	private double impostos;
	public List<ItemDaNota> itens;
	public String observacoes;
	public NotaFiscal(String razaoSocial, String cnjp, Calendar datDeEmissao, double valorBruto, double impostos,
			List<ItemDaNota> itens, String observacoes) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnjp = cnjp;
		this.datDeEmissao = datDeEmissao;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.itens = itens;
		this.observacoes = observacoes;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public String getCnjp() {
		return cnjp;
	}
	public Calendar getDatDeEmissao() {
		return datDeEmissao;
	}
	public double getValorBruto() {
		return valorBruto;
	}
	public double getImpostos() {
		return impostos;
	}
	public List<ItemDaNota> getItens() {
		return itens;
	}
	public String getObservacoes() {
		return observacoes;
	}
	@Override
	public String toString() {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		return String.format("Razão Social: %s\tCNPJ: %s\tData de Emissão: %s\nValor Bruto: %.2f\nImpostos: %.2f",
				getRazaoSocial(),getCnjp(),dateFormat.format(getDatDeEmissao().getTime()),
				getValorBruto(),getImpostos());
	}
}
