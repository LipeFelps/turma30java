package Lista4;

import java.util.Scanner;


public class exercicio5 {
	public static void main(String[] args) {
		int numero;
		int soma = 0;
		Scanner read = new Scanner(System.in);
		
		do {
			System.out.print("Digite um número: ");
			numero = read.nextInt();
			
			soma += numero;
		} while(numero != 0);
		
		System.out.printf("Soma: %d", soma);
		read.close();
	}

}

