package controller;

import util.Teclado;

public class Questao8 {
	
	/* Desenvolver um programa que armazene nome e nota das PR1 e PR2 de 15 alunos, calcule e armazene a média,
       armazene também a situação do aluno (AP ou RP). Exibir ao final uma listagem contendo nomes, notas, médias e
       situação de cada aluno.
	 * 
	 */

	public static void main(String[] args) {
		
	String nome[] = new String[15];
	double pr1[] = new double[15];
	double pr2[] = new double[15];
	double media[] = new double[15];
	String situacao[] = new String[15];
	
	System.out.println("--- Coletando dados dos alunos ---");
	for ( int cont = 0 ; cont < 3 ; cont ++ ) {
		nome[cont] = Teclado.lerTexto((cont + 1) + " - Nome?");
		pr1[cont] = Teclado.lerDouble("Nota PR1?");
		pr2[cont] = Teclado.lerDouble("Nota PR2?");
		
		media[cont] = ( pr1[cont] + pr2[cont]) / 2;
		
		if ( media[cont] >= 7) {
			situacao[cont] = "Aprovado";
		} else {
			situacao[cont] = "Reprovado";
		}
		System.out.println("--------------------------");
	}

	System.out.println("--- Boletim da turma ---");
	for ( int cont = 0 ; cont < 3 ; cont ++ ) {

	}
	}

}
