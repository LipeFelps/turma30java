package Lista3;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		int numero;
		int pares=0;
		int impares=0;
		Scanner read = new Scanner(System.in);

		for(int i=0; i<10; i++) {
			System.out.print("Digite um n�mero: ");
			numero = read.nextInt();

			if(numero <= 0) {
				System.out.print("N�mero inv�lido, digite outro.\n");
				i--;
			} else if(numero%2 == 0) {
				pares++;
			}else if(numero%2 == 1) {
				impares++;
			}

		}

		System.out.printf("Pares: %d\n", pares);
		System.out.printf("Impares: %d", impares);
		read.close();
	}
}


