package controller;

import util.Teclado;

public class DesvioCondicionalSimples {

	/*Algoritmo para ler dois valores numéricos, efetuar a adição e
      apresentar o resultado se o valor for maior que 10.
	 * 
	 */
	
	public static void main(String[] args) {
	
	int n1,n2,soma;
	
	n1 = Teclado.lerInt("Informe um número:");
	n2 = Teclado.lerInt("Informe outro número:");
	
	soma = n1 + n2;
	if ( soma > 10 ) {
		System.out.println("A soma dos dois números inseridos é " + soma);
	}

	}

}
