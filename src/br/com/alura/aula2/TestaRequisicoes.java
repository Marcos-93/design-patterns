package br.com.alura.aula2;

public class TestaRequisicoes {

	public static void main(String[] args) {
		Conta conta = new Conta("Marcos",1234,321,6000.00);
		Requisicao requisicao = new Requisicao(Formato.XML);
		
		MontaCorrente montaCorrente = new MontaCorrente();
		
		System.out.println(montaCorrente.montar(requisicao, conta));
	}

}
