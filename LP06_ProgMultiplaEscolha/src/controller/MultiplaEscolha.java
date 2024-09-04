package controller;

import util.Teclado;

public class MultiplaEscolha {
	
	/*Programa que pergunte o nº de matrícula de sócio de um Clube e
      exiba o mês de pagamento da anuidade, conforme a seguinte tabela:
	 * 
	 */
	
	public static void main(String[] args) {
		
	int mat,ultimo;
	
	mat = Teclado.lerInt("Informe o seu número de matrícula:");
	ultimo = mat % 10;
	
	switch ( ultimo ) {
	case 0 :
		System.out.println("Mês do pagamento: Janeiro");
		break;
		
	case 1 :
		System.out.println("Mês do pagamento: Fevereiro");
		break;
		
	case 2 :
		System.out.println("Mês do pagamento: Março");
		break;
			
	case 3 :
		System.out.println("Mês do pagamento: Abril");
		break;
				
	default :
		System.out.println("Mês do pagamento: Maio");
		break;
	}
		

	}

}
