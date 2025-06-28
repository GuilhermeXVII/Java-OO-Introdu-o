package Carro;

public class primeiroCarro {
	public static void main(String[] args) {
		Carro primeiroCarro = new Carro();
		
		primeiroCarro.ano = 1987;
		primeiroCarro.modelo = "Ômega";
		primeiroCarro.ligado = false;
		
		
		primeiroCarro.desligar();
		System.out.println("O carro está " + primeiroCarro.ligado);
		
		
		primeiroCarro.ligar();
		System.out.println("O carro está " + primeiroCarro.ligado);
		
		primeiroCarro.statusDoCarro();
		
		
		Carro segundoCarro = new Carro();
		
		segundoCarro.ano = 2003;
		segundoCarro.modelo = "Gol 16v";
		segundoCarro.ligado = false;
		
		
		segundoCarro.ligar();
		segundoCarro.statusDoCarro();
		
	}
}
