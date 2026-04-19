import java.util.Scanner;

public class ex_numeros_pares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros vc vai digitar? ");
		int n = sc.nextInt();

		int[] numeros = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}

		int qtd_pares = 0;
		for (int i = 0; i < n; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.println(numeros[i] + " ");
				qtd_pares += 1;
			}
		}

		System.out.println("Quantidade de pares = " + qtd_pares);
		
		sc.close();

	}

}
