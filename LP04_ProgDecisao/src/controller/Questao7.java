package controller;

import util.Teclado;

public class Questao7 {

	/* Desenvolver um programa que pergunte um valor inteiro positivo ou negativo, e exiba como resposta o módulo
      deste valor, 
      ou seja, o número lido como sendo positivo.
	 * 
	 */
	
	public static void main(String[] args) {
		
	int num;
	
	num = Teclado.lerInt("Informe um número interiro:");
	
	if ( num > 0 ) {
		System.out.println("O " + num + " é positivo ");
	} else {
		System.out.println("O " + num + " é negativo ");
	}
		

	}

}
