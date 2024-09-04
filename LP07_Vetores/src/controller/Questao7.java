package controller;

import util.Teclado;

public class Questao7 {
	
	/*Crie um vetor chamado semana com 7 elementos já contendo todos os nomes por extenso dos dias da semana.
     Em seguida pergunte ao usuário um número e apresente o dia correspondente ao número no vetor, ou exiba a
     mensagem “Número não corresponde a um dia da semana.”
	 * 
	 */

	public static void main(String[] args) {
	int dia;
	
	String semana[]= {"Domingo", "Segunda-Feira", "Terça-Feira" , "Quarta-Feira" , "Quinta-Feira" , "Sexta-Feira" , "Sábado"};

	dia = Teclado.lerInt("Informe um número correspondente ao dia da semana:");
	
	if (dia >=1 && dia <= 7) {
		System.out.println("Dia correspondente ao " + dia + " é " + semana[dia-1]);	
	} else {
		System.out.println("Número não corresponde a um dia da semana.");
	}
	
	
	
	}

}
