package bytebankk;

public class PrimeiraConta {
	public static void main(String[] args) {
		
		banco primeiraConta = new banco();
		
		primeiraConta.cpf = 107;
		System.out.println(primeiraConta.cpf);
		
		primeiraConta.salario = 200;
		System.out.println(primeiraConta.salario);
		
		primeiraConta.salario += 100;
		System.out.println(primeiraConta.salario);
		
		banco segundaConta = new banco();
		segundaConta.salario = 50;
		System.out.println(segundaConta.salario);
		
		
		System.out.println(primeiraConta.agencia);
		System.out.println(segundaConta.agencia);
		System.out.println(primeiraConta.numero);
		System.out.println(primeiraConta.titular);
		
		if(primeiraConta == segundaConta) {
			System.out.println("São a mesma conta!");
		}else {
			System.out.println("Contas diferentes!");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
	}
}
