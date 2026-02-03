import java.util.Scanner;

public class exs07 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.print("digite um valor inteiro: ");
			int n = sc.nextInt();
			
			int i, quadrado, cubo;
			
			for (i=1; i<=n; i++) {
				System.out.print(i);
				System.out.print(" ");
				quadrado = i*i;
				System.out.print(quadrado);
				System.out.print(" ");
				cubo = i*i*i;
				System.out.print(cubo);
				System.out.println();
			}
		}

	}

}
