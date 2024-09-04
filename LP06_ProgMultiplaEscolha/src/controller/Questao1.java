package controller;

import util.Teclado;

public class Questao1 {
	
	/*Desenvolver um programa que mostre o menu de opções da tabela abaixo e peça o código desejado. Mostre
      como resposta uma mensagem confirmando a escolha do usuário, ou que o número digitado não existe no
      menu de opções.
	 * 
	 */
	
	public static void main(String[] args) {
		
	int cod;
	
	cod = Teclado.lerInt("Informe um código usuário:");
	
	System.out.println("- Código - Opção");
	System.out.println("- 1      - Incluir");
	System.out.println("- 2      - Alterar");
	System.out.println("- 3      - Excluir");
	System.out.println("- 4      - Pesquisar");
	System.out.println("- 5      - Sair");
	System.out.println("---------------------");
	
	switch ( cod ) {
	case 1 :
		System.out.println("Opção escolhida: Incluir");
		break;
		
	case 2 :
		System.out.println("Opção escolhida: Alterar");
		break;
		
	case 3 :
		System.out.println("Opção escolhida: Excluir");
		break;
		
	case 4 :
		System.out.println("Opção escolhida: Pesquisar");
		break;
		
	case 5 :
		System.out.println("Opção escolhida: Sair");
		break;
		
	default :
		System.out.println("ERRO: Opção inexsistente");
		break;
	}
	
	
		
	}

}
