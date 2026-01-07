import java.util.Locale;
import java.util.Scanner;

public class exs5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Código da primeira peça: ");
		int pum = sc.nextInt();
		System.out.print("Quantidade de peças: ");
		int qtdum = sc.nextInt();
		System.out.print("Valor unitário: ");
		double valorum = sc.nextDouble();
		System.out.println();
		System.out.print("Código da segunda peça: ");
		int pdois = sc.nextInt();
		System.out.print("Quantidade de peças: ");
		int qtddois = sc.nextInt();
		System.out.print("Valor unitário: ");
		double valordois = sc.nextDouble();
		
		double totalum = qtdum*valorum;
		double totaldois = qtddois*valordois;
		double precototal = totalum+totaldois;
		
		System.out.println();
		System.out.printf("Total da primeira peça = R$ %.2f%n", totalum);
		System.out.printf("Total da segunda peça = R$ %.2f%n", totaldois);
		System.out.println("----------------------------------");
		System.out.printf("VALOR A PAGAR = R$ %.2f", precototal);
		
		sc.close();
	}

}