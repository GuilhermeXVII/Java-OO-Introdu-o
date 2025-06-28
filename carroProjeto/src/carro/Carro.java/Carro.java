package Carro;

public class Carro {
	int ano;
	String modelo;
	boolean ligado;
	
	
	void ligar() {
		this.ligado = true;
		
	}


	void desligar() {
		this.ligado = false;
		
		
	}
	
	void statusDoCarro() {
		System.out.println("O ano do seu carro é: " + this.ano + " modelo/marca: " + this.modelo + " e ele está: " + ligado);
	}

	
	
	
}
							
	