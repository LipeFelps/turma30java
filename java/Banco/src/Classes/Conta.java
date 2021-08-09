package Classes;


	

	public abstract class Conta {
		private int numero;
		private String nomeCliente;
		private double saldo;
		
		public Conta(int numero, String nomeCliente, double saldo) {
			super();
			this.numero = numero;
			this.nomeCliente = nomeCliente;
			this.saldo = saldo;
		}

		
		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public String getNomeCliente() {
			return nomeCliente;
		}

		public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}

		public double getSaldo() {
			return saldo;
		}




	
}


