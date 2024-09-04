package controller;

import util.Teclado;

public class Questao5 {

	public static void main(String[] args) {
	
	int valor1,valor2,soma,sub1,sub2,mult,div,RestDiv;
	
	
	valor1 = Teclado.lerInt("Informe um número:");
	valor2 = Teclado.lerInt("Informe outro número:");
	
	soma = valor1 + valor2;
	sub1 = valor1 - valor2;
	sub2 = valor2 - valor1;
	mult = valor1 * valor2;
	div = valor1 / valor2;
	RestDiv = valor1 % valor2;
	
	System.out.println("A soma dos dois números inseridos é " + soma);
	System.out.println("A subtração do primeiro número pelo segundo é " + sub1);
	System.out.println("A subtração do segundo número pelo primeiro é " + sub2);
	System.out.println("A multiplicação dos dois números inseridos é " + mult);
	System.out.println("A divisão do primeiro número pelo segundo é " + div);
	System.out.println("O resto da divisão do primeiro número pelo segundo é " + RestDiv);
	
	}

}
