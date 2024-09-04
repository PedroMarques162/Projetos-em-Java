package controller;

import util.Teclado;

public class LacoTesteInicio {

	/* Para pedir a leitura de um valor para a variável
	 * multiplicar este valor por 3, colocar o valor obtido na variável r,
	 * apresentar o valor de r, repetindo a sequência cinco vezes
	 * 
	 */
		
	public static void main(String[] args) {
		
	int x,r,cont;
	
	cont = 1;
	
	while ( cont <= 5 ) {
		x = Teclado.lerInt("Informe um número:");
		r = x * 3;
		System.out.println(x + " x 3 = " + r);
		
		cont = cont + 1;
	}
		

	}

}
