package controller;

import util.Teclado;

public class Questao3 {

	public static void main(String[] args) {
		
	double dolar,real;
	
	dolar = Teclado.lerDouble("Informe o seu sálario em Dólares:");
	
	real = dolar * 3.80;
	
	System.out.println("O seu valor convertido em real é R$ " + real);
	
		
	}

}
