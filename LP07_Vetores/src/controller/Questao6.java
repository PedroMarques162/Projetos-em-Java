package controller;

import util.Teclado;

public class Questao6 {
	
	/* Desenvolver um programa que pergunte 20 elementos de um vetor a e construa um vetor b de mesma
     dimensão com os mesmos elementos de a, os quais devem estar invertidos, ou seja, o primeiro elemento de a
     passa a ser o último elemento de b, e assim por diante. Apresentar os vetores a e b.
	 * 
	 */

	public static void main(String[] args) {
		
		int a[] = new int[20];
		int b[] = new int[20];
		
		for ( int cont = 0 ; cont < 20 ; cont ++ ) {
			a[cont] = Teclado.lerInt("Informe um número?");
			b[19-cont] = a[cont];
			
		}
		
		System.out.println("--- VETOR A ---");
		for ( int cont = 0 ; cont < 20 ; cont ++ ) {
			System.out.print(a[cont] + " ");
			
		}

		System.out.print("/n--- VETOR B ---");
		for ( int cont = 0 ; cont < 20 ; cont ++ ) {
			System.out.println(b[cont] + " ");
		}
		
	}

}
