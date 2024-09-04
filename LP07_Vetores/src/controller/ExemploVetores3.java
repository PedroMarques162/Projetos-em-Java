package controller;

import util.Teclado;

public class ExemploVetores3 {
	
	/*Pergunte o nome e idade de 5 pessoas . Ao final, exiba 
	 * a lista de nomes e idades
	 * 
	 */

	public static void main(String[] args) {
		
	String nomes[] = new String[5];
	int idades[] = new int[5];
	
	for (int cont = 0 ; cont < 5 ; cont++) {
		nomes[cont] = Teclado.lerTexto("Nome? ");
		idades[cont] = Teclado.lerInt("Idade? ");
		
	}
	
	System.out.println("--- Lista de nomes e idades ---");
	
	for (int cont = 0 ; cont < 5 ; cont++) {
		System.out.println("Nome: " + nomes[cont] + " - idade: " + idades[cont]);
	}
	
	}

}
