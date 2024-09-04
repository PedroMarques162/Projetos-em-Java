package controller;

import util.Teclado;

public class Questao8 {

	/*Desenvolver um programa que pergunte um número inteiro qualquer e verifique se ele está na faixa de 1 a 10
	 * 
	 */
	
	public static void main(String[] args) {
		
	int num;
	
	num = Teclado.lerInt("Informe um número interiro:");
	
	if ( num >= 1 && num <= 10) {
		System.out.println("O " + num + " inserido está entre 1 a 10 ");
	}

	}

}
