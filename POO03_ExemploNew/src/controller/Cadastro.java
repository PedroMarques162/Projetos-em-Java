package controller;

import model.Usuario;

public class Cadastro {

	public static void main(String[] args) {
		
		//Instanciar objeto de Usuário
		Usuario user = new Usuario();
		user.nome = "João da Silva Sauro";
		user.endereco = "Rua Sem Fim, 72";
		
		Usuario user2 = new Usuario();
		user2.nome = "Ana da Silva Suro";
		user2.endereco ="Rua do Começo,37";
		
		System.out.println("--- Dados do João ---");
		System.out.println("Nome: " + user.nome);
		System.out.println("Endereço: " + user.endereco);
		
		System.out.println("\n--- Dados da Ana ---");
		System.out.println("Nome: " + user2.nome);
		System.out.println("Endereço: " + user2.endereco);
	}

}
