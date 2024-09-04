package controller;

import util.Teclado;

public class Questao9 {

	/*Fazer um algoritmo que pergunte 1 número e apresente:
     a) O próprio número
     b) O quadrado deste número
     c) A raiz quadrada deste número
	 * 
	 */
	
	public static void main(String[] args) {
		
	int num;
	
	num = Teclado.lerInt("Informe um número:");
	
	System.out.println("O número inserido é " + num);
	
	Math.pow(num, 2);
	System.out.println("O quadrado desse número é " + num);
	
	Math.sqrt(num);
	System.out.println("A raiz desse número é " + num);
	
	

	}

}
