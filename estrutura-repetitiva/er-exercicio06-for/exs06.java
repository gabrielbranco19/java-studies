import java.util.Scanner;

public class exs06 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("digite um valor inteiro: ");
			int n = sc.nextInt();

			int i;

			for (i=1; i<=n; i++) {
				
				if (n%i==0) { /*imprimir o resultado se o resto da divisao de n (6) por i (1...2...3...) for igual a 0*/
				System.out.println(i);
				}
				
			}
			
		}

	}

}
