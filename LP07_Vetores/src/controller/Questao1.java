package controller;
import util.Teclado;

public class Questao1 {

	public static void main(String[] args) {
		
	String nome[] = new String[5];
	String profissao[] = new String[5];
	
	for ( int cont = 0 ; cont < 5 ; cont ++) {
		
	nome[cont] = Teclado.lerTexto((cont+1)+ "Nome ? ");
	profissao[cont] = Teclado.lerTexto("Profissão de " + (cont+1) + " ? ");
	
	}
		
	System.out.println("-- RELATÓRIO NOME E PROFISSÕES --");
	
	for ( int cont = 0 ; cont < 5 ; cont ++) {
		
	}
	
	}

}
