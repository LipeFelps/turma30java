package Lista1 ;

import java.util.Scanner;



public class exercicio3 {
	public static void main(String[] args) {
		int intervalo;
		int horas;
		int minutos;
		int segundos;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o intervalo de duração do evento, em segundos: ");
		intervalo = leia.nextInt();
		
		horas = intervalo/(60*60);
		minutos = (intervalo%(60*60))/60;
		segundos = (intervalo%(60*60))%60;

		System.out.print("O evento durou "+horas+" horas, "+minutos+" minutos e "+segundos+" segundos.");
		leia.close();
	}
	
}
	
