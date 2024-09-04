package controller;

import util.Teclado;

public class Q03 {

	public static void main(String[] args) {
		
	int num = Teclado.lerInt("Informe um número de 0 a 50");
	
   do {
	   System.out.println(num);
	   num = num+1;
	   
   } while ( num <= 50);
	
	
	
	
	}

}
