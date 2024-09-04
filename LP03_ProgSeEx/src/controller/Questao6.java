package controller;

import util.Teclado;

public class Questao6 {

	public static void main(String[] args) {
		
	double C,F;
	
	F = Teclado.lerDouble("Informe uma temperatura em Fahrenheit:");
	
	C = (F -32) * 5/9;
	
	System.out.println("A mesma temperatura convertida em Celsius é " + C);
		

	}

}
