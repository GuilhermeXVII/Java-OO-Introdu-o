package bytebankk;

class banco {
		int numero;
		int agencia = 42;
		double salario;
		String titular;
		int cpf;
		
		public void deposita(double valor){
			this.salario = this.salario + valor;
			
			//Ou this.salario += valor;
			
		}
		
		public  boolean saca(double valor) {
			if(this.salario >= valor) {
				this.salario = this.salario - valor;
				//Ou this.salatio -=valor;
				
				return true;
				
			}else {
				return false;
				
			}
		}
		
		public boolean transfere(double valor, double banco,  destino) {
			if(this.salario >= valor) {
				this.salario -= valor;
				destino.depoista(valor);
				return true;
				
			}
				return false;
				
			}
			
		}
		
}

