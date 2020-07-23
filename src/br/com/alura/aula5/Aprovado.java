package br.com.alura.aula5;


public class Aprovado implements EstadoDeUmOrcamento{
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.getValor()*0.02;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já está aprovado!");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos aprovados não podem ser reprovados!");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();  
	}
}
