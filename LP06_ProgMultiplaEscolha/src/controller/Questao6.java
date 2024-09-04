package controller;

import util.Teclado;

public class Questao6 {
	
	/*Desenvolver um programa que pergunte o peso de uma pessoa e também pergunte o código do planeta no qual
     ela gostaria de obter como resposta o valor do seu peso neste referido planeta. As informações da tabela abaixo
     (somente as colunas Código e Planeta) devem aparecer como menu de escolha ao usuário:
	 * 
	 */
	
	public static void main(String[] args) {
		
	double pesoNoPlaneta,pesoNaTerra,gravidadeRelativa;
	int cod;
	
    pesoNaTerra = Teclado.lerDouble("Informe o seu peso:");
   
   
    
    System.out.println("-----------------------------------------");
    System.out.println("- Código - Planeta  - Gravidade Relativa ");
    System.out.println("-   1    - Mercúrio -         0,37       ");
    System.out.println("-   2    - Vênus    -         0,88       ");
    System.out.println("-   3    - Marte    -         0,38       ");
    System.out.println("-   4    - Júpiter  -         2,64       ");
    System.out.println("-   5    - Saturno  -         1,15       ");
    System.out.println("-   6    - Urano    -         1,17       ");
	System.out.println("-----------------------------------------");	

	cod = Teclado.lerInt("Informe o código do Planeta que gostaria de obter como reposta ao seu peso:");
	
	switch ( cod ) {
	case 1:
	      gravidadeRelativa = 0.37;
	      break;
	      
	case 2:
		gravidadeRelativa = 0.88;
		break;
		
	case 3:
		gravidadeRelativa = 0.38;
		break;
		
	case 4:
		gravidadeRelativa = 2.64;
		break;
		
	case 5:
		gravidadeRelativa = 1.15;
		break;
		
	case 6:
		gravidadeRelativa = 1.17;
		break;
		
	default:
		System.out.println("Código inválido");
		gravidadeRelativa = 0;
	}
	
	pesoNoPlaneta = ( pesoNaTerra / 10 ) * gravidadeRelativa;
	
	System.out.println("O seu peso no planeta escolhido é " + pesoNoPlaneta + " kg ");
	
	
	}

}
