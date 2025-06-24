package bytebankk;

public class TesteReferencias {
	public static void main(String[] args) {
		banco primeiraConta = new banco();
		primeiraConta.salario = 300;
		
		System.out.println(primeiraConta.salario);
		banco segundaConta = primeiraConta;
		System.out.println(segundaConta.salario );
		
		segundaConta.salario +=100;
	 	System.out.println(primeiraConta.salario);
		
		if(primeiraConta == segundaConta) {
			System.out.println("Sao a mesma conta");
		}else {
			System.out.println("Não são a mesma conta!");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
