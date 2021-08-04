package Lista1;

import  java.util.Scanner ;


public class Lista1Exer1 {
	public static void main(String[] args) {
	int anos;
	int meses;
	int dias;
	int idade;
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Escreva quantos anos você tem: ");
	anos = leia.nextInt();
	System.out.print("Escreva quantos meses você tem: ");
	meses = leia.nextInt();
	System.out.print("Escreva quantos dias você tem: ");
	dias = leia.nextInt();
	
	idade = (anos*365) + (meses*30) + dias;
	
	System.out.print("Você tem "+idade+" dias de idade.");
	leia.close();}
}