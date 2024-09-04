package controller;

import util.Teclado;

public class Questao4 { 
	
	/* Desenvolver um programa que pergunte a sigla do estado onde a pessoa reside, e apresente uma das seguintes
       alternativas como resposta: Carioca, Paulista, Mineiro, Outros Estados.
	 * 
	 */
	
	public static void main(String[] args) {
		
	String estado;
	
	estado =Teclado.lerTexto("Informe a sua sigla do seu estado:");
	
	switch ( estado ) {
	case "RJ":
		System.out.println(" carioca ");
		break;
		
	case "SP":
		System.out.println(" paulista ");
		break;
		
	case "MG":
		System.out.println(" mineiro ");
		break;
		
	default:
		System.out.println("Outros Estado");
	}
		

	}

}
