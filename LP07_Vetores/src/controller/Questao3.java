package controller;

import util.Teclado;

public class Questao3 {

	public static void main(String[] args) {
		
	int a[] = new int[5];
	int soma = 0;
	
	for ( int cont = 0 ; cont < 5 ; cont ++) {
		  a[cont] = Teclado.lerInt("Valor para índice " + cont + "?");	
	      
		  if ( a[cont] % 2 == 1 ) {
	    	  soma = soma + a[cont]; 
	      }
	}
	  
	

	}

}
