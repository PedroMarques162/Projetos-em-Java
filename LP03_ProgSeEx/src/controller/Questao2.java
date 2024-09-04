package controller;

import util.Teclado;

public class Questao2 {

	public static void main(String[] args) {
		
    int num,soma,mult;
    
    num = Teclado.lerInt("Informe o primeiro número:");
    num = Teclado.lerInt("Informe o segundo número:");
    num = Teclado.lerInt("Informe o terceiro número:");
    num = Teclado.lerInt("Informe o quarto número:");
    
    soma = num + num + num + num;
    mult = num * num * num * num;
    
    System.out.println("A soma dos 4 números inseridos é " + soma);
    System.out.println("A múltiplicação dos 4 números inseridos é " + mult);
    	
    	
	}

}
