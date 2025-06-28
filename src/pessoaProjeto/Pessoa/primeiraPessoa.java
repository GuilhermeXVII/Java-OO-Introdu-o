package Pessoa;

public class primeiraPessoa {
	public static void main(String[] args) {
		Pessoa primeiraPessoa = new Pessoa();
		primeiraPessoa.nome = "Guilherme";
		primeiraPessoa.idade = 17;
		System.out.println(primeiraPessoa.idade);
		
		primeiraPessoa.fazerAniversario(1);
		System.out.println("Idade: " + primeiraPessoa.idade);
		
		
		primeiraPessoa.exibirInformacoes();

		
	}
}
