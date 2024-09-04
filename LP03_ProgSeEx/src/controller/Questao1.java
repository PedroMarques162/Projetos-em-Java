package controller;

import util.Teclado;

public class Questao1 {

	public static void main(String[] args) {
		
     String nome;
     String sexo;
     
     nome = Teclado.lerTexto("Bem-Vindo Usuário, Informe o seu nome completo:");
     System.out.println("Olá!" + nome);
     
     sexo = Teclado.lerTexto("Por último, o seu sexo:");
     System.out.println("E o seu sexo é " + sexo);
     
		
	}

}
