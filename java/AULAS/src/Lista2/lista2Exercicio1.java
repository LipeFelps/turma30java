package Lista2;
import java.util.Scanner;
//exercicio 4
public class lista2Exercicio1 {
	
	public static void main(String[] args) {
		
		
		//variaveis;
		double numero;
		Scanner leia = new Scanner (System.in);
		
		//entrada
		System.out.print("Digite um numero :");
		numero = leia.nextDouble();
		
		//processamento
		
		if(numero<0) {
			System.out.println("Impossivel realizar, numero negatiovo");
			
		} 
		else if (numero==0) {
			System.out.println("Zero � neutro");
		}
		
		else if ((numero%2)==0) {
			System.out.println("O numero � par");
			System.out.println("a raiz quadrada de %f � %f",numero,(Math.sqrt(numero)));
			
		} else if ((numero%2)==1) {
			System.out.println("O numero � impar");
		System.out.println("o numero %f ao quadrado � %f ",numero,(Math.sqrt(numero)));
		}
	}

}
