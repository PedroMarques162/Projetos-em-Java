package controller;

import util.Teclado;

public class Questao4 {

	public static void main(String[] args) {
		
	int num,ant,suc;
	
	num = Teclado.lerInt("Informe um número qualquer:");
	
	ant = (num -1);
	suc = (num +1);
	
	System.out.println("O antecessedor é " + ant + " e o seu sucessor é " + suc);
		
	}

}
