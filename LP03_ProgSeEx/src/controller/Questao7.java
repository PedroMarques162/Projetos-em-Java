package controller;

import util.Teclado;

public class Questao7 {

	public static void main(String[] args) {
		
    int valor, reFinal;
    
    valor = Teclado.lerInt("Informe o primeiro número:");
    valor = Teclado.lerInt("Informe o segundo número:");
    valor = Teclado.lerInt("Informe o terceiro número:");
    
    reFinal = valor + valor + valor / 3;
		
    System.out.println("A média aritmética dos 3 números inseridos é " + reFinal);
	}

}
