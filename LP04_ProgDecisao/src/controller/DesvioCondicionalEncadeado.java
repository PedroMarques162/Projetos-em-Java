package controller;

import util.Teclado;

public class DesvioCondicionalEncadeado {

	/*Elaborar um programa que calcule o reajuste de salário de um funcionário, sob as seguintes
      condições: Reajuste de 15% se salário menor que R$ 500,00. Reajuste de 10% se salário entre R$
      500,00 e R$ 1000,00. Reajuste de 5% se salário acima de R$ 1000,00.
	 * 
	 */
		
	public static void main(String[] args) {
	
	double salario,salFinal;
	
	salario = Teclado.lerDouble("Informe o seu salário do funcionário:");
	
	if ( salario < 500 ) {
		salFinal = salario + (salario * 15 / 100);
	} else {
		if ( salario <= 1000) {
			salFinal = salario + (salario * 10 / 100);
		} else {
			salFinal = salario + (salario * 5 / 100);
		}
	}
		
    System.out.println("O salário com reajuste é " + salFinal);
		
	}

}
