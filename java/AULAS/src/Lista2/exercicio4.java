package Lista2 ;

import java.util.Scanner;



public class exercicio4 {
	public static void main(String[] args) {
		
				double numero;
				
				Scanner leia = new Scanner (System.in);
				
				
				System.out.print("DIGITE UM N�MERO: ");
				numero = leia.nextDouble();
				
				if (numero % 2 == 0)
				{	
					System.out.print("O NUMERO " + numero + ", � PAR! E SUA RAIZ �: " + Math.sqrt(numero));
				}
				
				else
				{	
					System.out.print("O NUMERO " + numero + ", � �MPAR! E ELEVADO AO QUADRADO �: " + Math.pow(numero,2));
				}
			}
		}
	