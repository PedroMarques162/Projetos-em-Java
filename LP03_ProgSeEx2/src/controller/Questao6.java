package controller;

import util.Teclado;

public class Questao6 {

	public static void main(String[] args) {
	
	String nome;
	double salarioFx,TotalVendas,SaFinal,comissao;
	
	nome = Teclado.lerTexto("Informe o nome do vendendor:");
	salarioFx = Teclado.lerDouble("Logo em seguida, informa o seu salário fixo:");
	TotalVendas = Teclado.lerDouble("Por último, informe o total de vendas efetuadas no mês em dinheiro:");
	
	comissao = TotalVendas * 15 / 100;
	
	System.out.println("Nome " + nome);
	System.out.println("salarioFx R$ " + salarioFx);
	
	
	
	
		
		
	}

}
