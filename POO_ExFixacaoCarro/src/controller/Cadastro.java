package controller;

import model.Carro;

public class Cadastro {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		c1.setFabricante("Fiat");
		c1.setModelo("Uno");
		c1.setAno(2010);
		c1.setMotorLigado(false);
		c1.setVelocidade(0);
	
	System.out.println("Carro 1:");
	System.out.println("Fabricante " + c1.getFabricante());
	System.out.println("Modelo :" + c1.getModelo());
	System.out.println("Ano :" + c1.getAno());
	System.out.println("Motor Ligado? " + c1.isMotorLigado());
	System.out.println("Velocidade :" + c1.getVelocidade());
	
	Carro c2 = new Carro("VW","Gol",2018,true,50);
	
	System.out.println("\nCarro 2:");
	System.out.println("Fabricante " + c1.getFabricante());
	System.out.println("Modelo :" + c1.getModelo());
	System.out.println("Ano :" + c1.getAno());
	System.out.println("Motor Ligado? " + c1.isMotorLigado());
	System.out.println("Velocidade :" + c1.getVelocidade());
	
	
	
	
	
	
	}

}
