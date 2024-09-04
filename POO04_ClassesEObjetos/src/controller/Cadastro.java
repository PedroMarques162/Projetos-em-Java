package controller;

import model.Carro;
import model.Funcionario;
import model.Livro;

public class Cadastro {

	public static void main(String[] args) {
		
		Carro uno = new Carro();
		uno.fabricante = "Fiat";
		uno.modelo = "Fiat Uno";
		uno.cor = "Vermelho";
		uno.ano = 2012;
		
		Funcionario user = new Funcionario();
		user.matricula = 1612;
		user.nome = "Pedro Marques";
		user.cpf = "17662992705";
		
		Funcionario user2 = new Funcionario();
		user2.matricula = 1613;
		user2.nome = "João Gabriel";
		user2.cpf = "14589335812";
		
		Funcionario user3 = new Funcionario();
		user3.matricula = 1614;
		user3.nome = "Rosália Marques";
		user3.cpf = "92762917605";
		
		
		Livro book = new Livro();
		
		

	}

}
