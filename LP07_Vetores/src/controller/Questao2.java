package controller;

import util.Teclado;

public class Questao2 {

	public static void main(String[] args) {
		
	int a[] = new int[5];
	int soma = 0;
	
	for ( int cont = 0 ; cont < 5 ; cont ++) {
		
	a[cont] = Teclado.lerInt("Número  para índice " + cont + "?");
	soma = soma + a[cont];
	
		
	}

	}

}
