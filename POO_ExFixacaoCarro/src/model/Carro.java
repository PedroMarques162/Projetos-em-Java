package model;

public class Carro {
	
	private String fabricante;
	private String modelo;
	private int ano;
	private boolean motorLigado;
	private int velocidade;
	public String getFabricante() {
		
		
		
		
		
		
		return fabricante;
	} //método construtor completo
	public Carro() {
		super();
	}
	public Carro(String fabricante, String modelo, int ano, boolean motorLigado, int velocidade) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.motorLigado = motorLigado;
		this.velocidade = velocidade;
	
	
	
	    
	
	
	
	
	
	
	
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public boolean isMotorLigado() {
		return motorLigado;
	}
	public void setMotorLigado(boolean motorLigado) {
		this.motorLigado = motorLigado;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	
}
