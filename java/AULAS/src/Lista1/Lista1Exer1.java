package Lista1;

import  java.util.Scanner ;


public class Lista1Exer1 {
	public static void main(String[] args) {
	int anos;
	int meses;
	int dias;
	int idade;
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Escreva quantos anos voc� tem: ");
	anos = leia.nextInt();
	System.out.print("Escreva quantos meses voc� tem: ");
	meses = leia.nextInt();
	System.out.print("Escreva quantos dias voc� tem: ");
	dias = leia.nextInt();
	
	idade = (anos*365) + (meses*30) + dias;
	
	System.out.print("Voc� tem "+idade+" dias de idade.");
	leia.close();}
}