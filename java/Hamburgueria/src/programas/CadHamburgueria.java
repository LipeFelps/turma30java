package programas;

import java.util.Scanner;

import entidade.Produto;

public class CadHamburgueria {
	public static void main(String[] args) {
		
		Produto prod1 = new Produto("001","CAMISA");
		Produto prod2 = new Produto("002","CALÇA",100.50,10);
				
		prod2.retiraEstoque(5);
		prod1.setEstoque(10);
		System.out.println(prod1.getNome()+" qtde "+prod1.getEstoque());
		System.out.println(prod2.getNome()+" qtde "+prod2.getEstoque());

		
		prod1.setNome("CAMISETA");
		prod2.setValor(100);
		System.out.println(prod2.getValor()*2);
		System.out.println(prod2.getEstoque());

}
}
