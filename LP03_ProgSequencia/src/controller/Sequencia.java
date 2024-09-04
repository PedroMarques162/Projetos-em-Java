package controller;

import util.Teclado;

public class Sequencia {

	public static void main(String[] args) {
		
    String nome;
    int idade;
    double salario;
    
    nome = Teclado.lerTexto("Bem-Vindo Usuário,informe o seu nome:");
    System.out.println("Olá " + nome);
    
    idade = Teclado.lerInt("Agora,informe a sua idade:");
    System.out.println("Você tem " + idade + " anos");
    
    salario = Teclado.lerDouble("Por último, informe o seu salário:");
    System.out.println("Você ganha R$" + salario);
    
	}

}
