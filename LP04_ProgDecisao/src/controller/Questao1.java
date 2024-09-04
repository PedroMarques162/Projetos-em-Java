package controller;

import util.Teclado;

public class Questao1 {
	/*Desenvolver um programa que pergunte um número. 
	 * Se este número for maior que 20, então ele deverá exibir a
     metade deste número,
      senão, ele deverá exibir o número sem alterações.
	 * 
	 */
	public static void main(String[] args) {
	
		int num;
		
		num = Teclado.lerInt("Informe um número:");
		
		if ( num > 20 ) {
			System.out.println("O número inserido é " + ( num / 2 ));
		} else {
			System.out.println("O número inserido é " + num);
		}
			
	}

}
