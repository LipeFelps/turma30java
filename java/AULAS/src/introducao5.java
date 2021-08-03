import java.util.Scanner;

public class introducao5 {
	public static void main(String[] args) {
		double nota1;
		double nota2;
		double nota3;
		double mediaPonderada;
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite as três notas do aluno, separadas por 'ENTER': ");
		nota1 = leia.nextDouble();
		nota2 = leia.nextDouble();
		nota3 = leia.nextDouble();

		mediaPonderada = ((nota1*2) + (nota2*3) + (nota3*5))/(2 + 3 + 5);

		System.out.print("A média ponderada do alune é: " +mediaPonderada);
		leia.close();
	}

	}

