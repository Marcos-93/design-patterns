package br.com.alura.aula5;


public class TesteDeDescontoExtra {

	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(500.00);
		System.out.println(reforma.getValor());
		
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
		
		reforma.aprova();
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
		
		reforma.finaliza();
		reforma.aprova();
	}

}
