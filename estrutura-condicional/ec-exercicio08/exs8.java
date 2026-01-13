import java.util.Locale;
import java.util.Scanner;

public class exs8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double renda, imposto;
		
		System.out.println("VERIFICADOR DE IMPOSTO DE RENDA");
		System.out.println();
		System.out.print("Digite sua renda mensal: R$ ");
		renda = sc.nextDouble();
		
		if (renda>0 && renda<=2000.00) {
			System.out.println("Você está ISENTO!");
		} else if (renda<=3000.00) {
			imposto = (renda-2000.00)*0.08;
			System.out.printf("você vai pagar R$ %.2f de imposto.", imposto);
		} else if (renda<=4500.00) {
			imposto = (1000.00*0.08)+(renda-3000.00)*0.18;
			System.out.printf("você vai pagar R$ %.2f de imposto.", imposto);
		} else if (renda>4500.00) {
			imposto = (1000.00*0.08) + (1500.00*0.18) + (renda-4500.00)*0.28;
			System.out.printf("você vai pagar R$ %.2f de imposto.", imposto);
		} else {
			System.out.println("Valor inválido.");
		}
		
		sc.close();
		
	}

}
