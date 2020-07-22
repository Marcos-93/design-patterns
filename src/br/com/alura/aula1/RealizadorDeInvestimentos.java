package br.com.alura.aula1;
public class RealizadorDeInvestimentos {
	public void executa(Conta conta,Investimento investimento) {
		double rendimento = investimento.calcula(conta);
		conta.adiciona(rendimento * 0.75);
		System.out.println(String.format("Novo saldo: %.2f",conta.getSaldo()));
	}
}
