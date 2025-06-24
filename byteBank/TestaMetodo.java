package bytebankk;

public class TestaMetodo {
	public static void main(String[] args) {
		banco contaDoGuilherme = new banco();
		contaDoGuilherme.salario = 100;
		
		contaDoGuilherme.deposita(21);
		System.out.println(contaDoGuilherme.salario);
		
		contaDoGuilherme.deposita(21);
		System.out.println(contaDoGuilherme.salario);
		
		contaDoGuilherme.saca(20);
		System.out.println(contaDoGuilherme.salario);
		
		boolean saqueConcluido = contaDoGuilherme.saca(120);
		System.out.println(saqueConcluido);
		
		banco contaDoPaulo = new banco();
		contaDoPaulo.deposita(1000);
		System.out.println(contaDoPaulo.salario);
		
		
	}
}
