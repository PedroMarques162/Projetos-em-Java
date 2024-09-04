package controller;

import util.Teclado;

public class Questao5 {
	
	/*Desenvolver um programa que pergunte um número de 1 a 12, e responda o mês correspondente ao número,
      ou se o número não corresponde a nenhum dos 12 meses.
	 * 
	 */
	
	public static void main(String[] args) {
		
	int num;
	
	num = Teclado.lerInt("Informe um número desejado de um mês:");
	
	switch ( num ) {
	case 1:
		System.out.println("Janeiro");
		break;
		
	case 2:
		System.out.println("Fevereiro");
		break;
		
	case 3:
		System.out.println("Março");
		break;
		
	case 4:
		System.out.println("Abril");
		break;
		
	case 5:
		System.out.println("Maio");
		break;
		
	case 6:
		System.out.println("Junho");
		break;
		
	case 7:
		System.out.println("Julho");
		break;
		
	case 8:
		System.out.println("Agosto");
		break;
		
	case 9:
		System.out.println("Setembro");
		break;
		
	case 10:
		System.out.println("Outubro");
		break;
		
	case 11:
		System.out.println("Novembro");
		break;
		
	case 12:
		System.out.println("Dezembro");
		break;
		
	default:
		System.out.println("Nenhuma alternativa correnspondida");
	}
	
	
		

	}

}
