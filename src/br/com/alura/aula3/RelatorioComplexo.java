package br.com.alura.aula3;

import java.util.Calendar;
import java.util.List;

import br.com.alura.aula2.Conta;

public class RelatorioComplexo extends Relatorio {

	@Override
	protected void cabecalho() {
		// TODO Auto-generated method stub
		System.out.println("Banco XYZ");
        System.out.println("Avenida Paulista, 1234");
        System.out.println("(11) 1234-5678");
	}

	@Override
	protected void rodape() {
		// TODO Auto-generated method stub
		System.out.println("banco@xyz.com.br");
        System.out.println(Calendar.getInstance().getTime()); 
	}

	@Override
	protected void corpo(List<Conta> contas) {
		// TODO Auto-generated method stub
		for(Conta conta : contas) {
	          System.out.println(String.format("%s - %d - %d - %.2f",conta.getNome(),conta.getNumero(),conta.getAgencia(), conta.getSaldo()));
	        }
	}

}
