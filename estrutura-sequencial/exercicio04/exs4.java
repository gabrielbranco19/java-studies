import java.util.Locale;
import java.util.Scanner;

public class exs4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número do funcionário: ");
		int n = sc.nextInt();
		System.out.print("Número de horas trabalhadas: ");
		double h = sc.nextDouble();
		System.out.print("Valor por hora trabalhada: ");
		double valor = sc.nextDouble();
		
		double salario = h*valor;
		
		System.out.print("Funcionário " + n);
		System.out.printf("Salário = U$ %.2f", salario);
		
		sc.close();
	}

}