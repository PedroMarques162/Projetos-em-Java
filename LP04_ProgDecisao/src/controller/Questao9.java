package controller;

import util.Teclado;

public class Questao9 {

	/*Desenvolver um programa que pergunte um número e exiba a informação de que ele é positivo, negativo ou
      nulo.
	 * 
	 */
	
	public static void main(String[] args) {
		
	int num;
	
	num = Teclado.lerInt("Informe um número:");
	
	if ( num > 0 ) {
		System.out.println("O " + num + " é positivo ");
	} else {
		if ( num < 0 ) {
			System.out.println("O " + num + " é negativo ");
		} else {
			System.out.println("O " + num + " é nulo ");
		}
	}
		
		
	}

}
