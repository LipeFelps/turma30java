package Lista1 ;

import java.util.Scanner;



public class exercicio8 {
	public static void main(String[] args) {
		
		double valorFabrica, distribuidor, impostos, valorConsumidor;
		Scanner leia = new Scanner(System.in);

		System.out.print("digite o valor de f�brica d autom�vel: ");
		valorFabrica = leia.nextDouble();

		distribuidor = valorFabrica*0.28;
		impostos = valorFabrica*0.45;

		valorConsumidor = valorFabrica + distribuidor + impostos;

		System.out.print("O valor de venda do autom�vel �: " +valorConsumidor);
		leia.close();
	}
	
}
	
