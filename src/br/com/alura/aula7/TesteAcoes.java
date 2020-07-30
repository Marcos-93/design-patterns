package br.com.alura.aula7;

public class TesteAcoes {
	public static void main(String[] args) {
	 NotaFiscalBuilder builder = new NotaFiscalBuilder();
	 builder.adicionaAcao(new EnviadorDeEmail());
	 builder.adicionaAcao(new NotaFiscalDao());
	 builder.adicionaAcao(new EnviadorDeSms());
	 builder.adicionaAcao(new Impressora());
	 builder.adicionaAcao(new Multiplicador(3));
	 
	 NotaFiscal notaFiscal = builder.paraEmpresa("Caelum").comCnpj("123")
	 		.comItem(new ItemDaNota("Item",100.00)).comObservacoes("Observação")
	 		.naDataAtual().constroi();
	 System.out.println(notaFiscal);
	}
}
