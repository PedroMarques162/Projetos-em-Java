package controller;

import util.Teclado;

public class Questao3 {

	public static void main(String[] args) {
		
	double Q,M,G,C;
	
	Q = Teclado.lerDouble("Informe o seu peso em Quilos:");
	M = Teclado.lerDouble("Informe a sua altura em metros:");
	
	G = Q * 1000;
	C = M * 100;
	
	System.out.println("O seu peso convertido em gramas é " + G);
	System.out.println("A sua altura convertida em centímetros é " + C);

	}

}
