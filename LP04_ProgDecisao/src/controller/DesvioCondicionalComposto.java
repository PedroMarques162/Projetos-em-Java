package controller;

import util.Teclado;

public class DesvioCondicionalComposto {

	/*Algoritmo para ler dois valores numéricos, efetuar a adição. Se a soma
      for maior ou igual a 10, apresente o resultado somando 5, senão, apresente o
      resultado subtraindo 7.
	 * 
	 */
		
	public static void main(String[] args) {
		
	int n1,n2,soma;
	
	n1 = Teclado.lerInt("Informe um número:");
	n2 = Teclado.lerInt("Informe outro número:");
	
	soma = n1 + n2;
	
	
	if ( soma >= 10 ) {
		System.out.println("O resultado + 5 é " + ( soma + 5));
		
	} else {
		System.out.println("O resultado - 7 é " + ( soma - 7));
	}
		
		
		
	}

}
