package Lista5PolimorfismoHerança;

public class exercicio5 {
	 String codigoProduto;
		private String nomeProduto;
		private int qntdEstoque;
		
		public exercicio5(String codigoProduto, String nomeProduto, int qntdEstoque) {
			super();
			this.codigoProduto = codigoProduto;
			this.nomeProduto = nomeProduto;
			this.qntdEstoque = qntdEstoque;
		}

		public String getCodigoProduto() {
			return codigoProduto;
		}

		public void setCodigoProduto(String codigoProduto) {
			this.codigoProduto = codigoProduto;
		}

		public String getNomeProduto() {
			return nomeProduto;
		}

		public void setNomeProduto(String nomeProduto) {
			this.nomeProduto = nomeProduto;
		}

		public int getQntdEstoque() {
			return qntdEstoque;
		}

		public void setQntdEstoque(int qntdEstoque) {
			this.qntdEstoque = qntdEstoque;
		}
		
		
	}


