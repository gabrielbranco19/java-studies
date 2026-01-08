import java.util.Scanner;

public class exs1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n;
		
		System.out.print("digite um número: ");
		n = sc.nextInt();
		
		System.out.println("----------------------------------------");
		System.out.println("VERIFICANDO SE É POSITIVO OU NEGATIVO...");
		System.out.println("----------------------------------------");
		if (n < 0) { // condição if (se) seguido de uma condição para declarar que numeros menores de 0, serão negativos.
			System.out.print(n + " é negativo!");
		}
		else { // else (senão) sem a obrigatoriedade da condição pois se não for negativo, logo, é positivo.
			System.out.print(n + " é positivo!");
		}
		
		sc.close();
	}

}
