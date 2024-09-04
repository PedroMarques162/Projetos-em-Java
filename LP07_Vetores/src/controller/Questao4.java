package controller;

import util.Teclado;

public class Questao4 {

	public static void main(String[] args) {
		
	int a[] = new int[8];
	int b[] = new int [8];
	
	for ( int cont = 0 ; cont < 5 ; cont ++) {
	a[cont] = Teclado.lerInt("Valor para índice " + cont + "?");
	b[cont] = a[cont] * 3;
	}

	for ( int cont = 0 ; cont < 5 ; cont ++) {
		System.out.println(a[cont] + " x 3 = " + b[cont]);
	}
	
	
	
	}

}
