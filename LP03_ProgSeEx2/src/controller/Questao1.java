package controller;

import util.Teclado;

public class Questao1 {

	public static void main(String[] args) {
		
	double VaInicial,VaFinal;
	
	VaInicial = Teclado.lerDouble("Informe o valor da conta a ser paga do Restaurante:");
	
	VaFinal = VaInicial + (VaInicial * 10 / 100);
	
	System.out.println("O valor da conta a ser paga com o acréscimo de 10% é " + VaFinal);

	}

}
