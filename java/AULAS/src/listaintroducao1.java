import java.util.Scanner;

public class listaintroducao1 {
	
	public static void main(String[] args) {
	int anos;
	 int meses;
	 int dias;
	 int totalDias; 
	 Scanner leia = new Scanner(System.in); 
	 
	 System.out.print("Digite o numero de anos :");
	 anos = leia.nextInt();
	 System.out.print("Digite o numero de meses :");
	 meses = leia.nextInt();
	 System.out.print("Digite o numero de dias :");
	 dias = leia.nextInt();
	 totalDias = (anos * 365) + (meses * 30) + dias;

			 System.out.print("Total de dias na terra :"+totalDias);








	}
}
