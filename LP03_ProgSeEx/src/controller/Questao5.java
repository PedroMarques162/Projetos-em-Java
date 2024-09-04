package controller;

import util.Teclado;

public class Questao5 {

	public static void main(String[] args) {
		
	double salário,num;
	
	salário = Teclado.lerDouble("Informe o seu salário:");
	
	num = salário + (salário * 15 / 100);
	
	
	System.out.println("O seu salário de reajuste com 15% é R$ " + num);
	

	}

}
