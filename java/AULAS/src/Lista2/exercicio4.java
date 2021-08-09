package Lista2 ;

import java.util.Scanner;



public class exercicio4 {
	public static void main(String[] args) {
		
				double numero;
				
				Scanner leia = new Scanner (System.in);
				
				
				System.out.print("DIGITE UM NÚMERO: ");
				numero = leia.nextDouble();
				
				if (numero % 2 == 0)
				{	
					System.out.print("O NUMERO " + numero + ", É PAR! E SUA RAIZ É: " + Math.sqrt(numero));
				}
				
				else
				{	
					System.out.print("O NUMERO " + numero + ", É ÍMPAR! E ELEVADO AO QUADRADO É: " + Math.pow(numero,2));
				}
			}
		}
	