package br.com.alura.aula2;


public class MontaCorrente {
	public String montar(Requisicao req,Conta acount) {
		CorrenteXML xml = new CorrenteXML();
		CorrenteCSV csv = new CorrenteCSV();
		CorrentePorcento porcento = new CorrentePorcento();
		CorrenteFim fim = new CorrenteFim();
		
		xml.setCorrente(csv);
		csv.setCorrente(porcento);
		porcento.setCorrente(fim);
		
		return xml.formata(req,acount);
	}
}
