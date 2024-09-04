package controller;

import util.Teclado;

public class Questao4 {

	public static void main(String[] args) {
	
	double peso,altura,imc;
	
	peso = Teclado.lerDouble("Informe o seu peso em quilos:");
	altura = Teclado.lerDouble("Infome a sua altura em metros:");
	
	imc = peso / (Math.pow(altura, 2));
	
	System.out.println("O seu índice de massa corporal é " + imc);

	}

}
