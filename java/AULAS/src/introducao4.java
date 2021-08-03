import java.util.Scanner;

public class introducao4 {
	public static void main(String[] args) {

		int A, B, C;
		double R;
		double S;
		double D;
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite A: ");
		A = leia.nextInt();
		System.out.print("Digite B: ");
		B = leia.nextInt();
		System.out.print("Digite C: ");
		C = leia.nextInt();
		
		R = Math.pow((A+B), 2);
		S = Math.pow((B+C), 2);

		D = (R + S)/2;

		System.out.print("D = "+D);
		leia.close();
	}
}

