package Pessoa;

public class Pessoa {
	String nome;
	int idade;
	
	void fazerAniversario(int acresentaIdade) {
		this.idade++;
		
	}
	
	void exibirInformacoes() {
		System.out.println("O seu nome é: " + this.nome + " é você tem " + 
		this.idade + " anos.");
		
	}
	
}
