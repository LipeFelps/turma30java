
import java.util.Scanner;

public class introducao8 {
	public static void main(String[] args) {
		
		int A, B, C, D, E, F;
		double x, y;
		Scanner leia = new Scanner(System.in);

		System.out.print("Defina os 6 coeficientes (a,b,c,d,e,f) das equações (dê ENTER para cada um): ");
		A = leia.nextInt();
		B = leia.nextInt();
		C = leia.nextInt();
		D = leia.nextInt();
		E = leia.nextInt();
		F = leia.nextInt();

		x = ((C*E)-(B*F))/((A*E)-(B*D));
		y = ((A*F)-(C*D))/((A*E)-(B*D));

		System.out.print("As variáveis x e y são, respectivamente: "+x+" e "+y);
		leia.close();
	}


	}


