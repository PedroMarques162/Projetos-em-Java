package controller;

import util.Teclado;

public class Questao5 {

	public static void main(String[] args) {
		
	int a[] = new int[5];
	int b[] = new int[5];
	
	for ( int cont = 0 ; cont < 5 ; cont++) {
		a[cont] = Teclado.lerInt("Valor para índice 0 " + cont + "?");

	}

	for ( int cont = 0 ; cont < 5 ; cont++) {
		System.out.println(a[cont]);
	}
	
	}

}
