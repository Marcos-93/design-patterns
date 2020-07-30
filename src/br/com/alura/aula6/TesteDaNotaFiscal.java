package br.com.alura.aula6;

public class TesteDaNotaFiscal {
	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.paraEmpresa("Caelum Ensino e Inovação").comCnpj("12.345.678/0001-12")
		.comItem(new ItemDaNota("Item 1",400.00))
		.comItem(new ItemDaNota("Item 2",500.00))
		.comItem(new ItemDaNota("Item 3",300.00))
		.comObservacoes("Uma observação sobre a nota")
		.naDataAtual();
		
		NotaFiscal notaFiscal = builder.constroi();
		
		System.out.println(notaFiscal);
		
	}
	 
}
