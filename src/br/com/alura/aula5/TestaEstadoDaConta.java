package br.com.alura.aula5;

public class TestaEstadoDaConta {

	public static void main(String[] args) {
		Conta conta = new Conta(25.00);
		System.out.println(conta.sacar(15.00));
		System.out.println(conta.depositar(5.00));
		
		System.out.println(conta.sacar(40.00));
		
		System.out.println(conta.depositar(30.00));
		System.out.println(conta);
	}

}
