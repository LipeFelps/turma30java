package Lista4;

import java.util.Scanner;


public class exercicio3 {
	public static void main(String[] args) {
		int idade=0;
		int menos21=0;
		int mais50=0;
		Scanner read = new Scanner(System.in);
		
		while(idade != -99) {
			System.out.print("Entre com uma idade, ou digite -99 para encerrar: ");
			idade = read.nextInt();
			
			if(idade < 21 && idade > 0) {
				menos21++;
			} else if (idade > 50) {
				mais50++;
			}
			
		}
		
		System.out.printf("Pessoas com menos de 21 anos: %d.", menos21);
		System.out.printf("\nPessoas com mais de 50 anos: %d.", mais50);
		read.close();
	}

}

