package br.com.alura.aula7;

public class Multiplicador implements AcaoAposGerarNota {

	private double fator;
	
	public Multiplicador(double fator) {
		this.fator = fator;
	}
	
	@Override
	public void executa(NotaFiscal nf) {
		System.out.println(String.format("Valor Total: %.2f\tFator: %.2f\tResultado: %.2f",
				nf.getValorBruto(),this.fator,nf.getValorBruto()*this.fator ));
	}

}
