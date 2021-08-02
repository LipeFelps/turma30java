import java.util.Scanner;

public class introducao2 {
	public static void main(String[] args) {
		int anos;
		int meses;
		int dias;
		int totalDias;
		Scanner leia = new Scanner(System.in); 
		
		System.out.print("Digite a sua idade no total de dias ");
		totalDias = leia.nextInt();

		anos = totalDias / 365;
		meses = (totalDias % 365) / 30;
		dias =  (totalDias % 365) % 30;


		System.out.print("\nAno(s)  : "+anos);
		System.out.print("\nMes(es) : "+meses);
		System.out.print("\nDia(s)  : "+dias);
	}

}
