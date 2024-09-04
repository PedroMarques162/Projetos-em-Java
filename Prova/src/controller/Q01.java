package controller;

import util.Teclado;

public class Q01 {

	public static void main(String[] args) {
		
	int num,acum;
	
	num = Teclado.lerInt("Informe um número:");
	acum = 0;
	
	for ( int cont = 0 ; cont <= num ; cont ++) {
	acum = acum + cont;	
	}

	
	System.out.println("Valor de s: " + acum);
	}

}
