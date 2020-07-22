package br.com.alura.aula3;

import java.util.List;

import br.com.alura.aula2.Conta;

public class RelatorioSimples extends Relatorio{

	@Override
	protected void cabecalho() {
		// TODO Auto-generated method stub
		System.out.println("Banco XYZ");
	}

	@Override
	protected void rodape() {
		// TODO Auto-generated method stub
		System.out.println("(11) 1234-5678");
	}

	@Override
	protected void corpo(List<Conta> contas) {
		// TODO Auto-generated method stub
		for(Conta conta : contas) {
	          System.out.println( conta.getNome() + " - " + conta.getSaldo() );
	        }
	}

}
