import java.util.Locale;
import java.util.Scanner;

public class exs04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {

			int i, n;
			double div, x1, x2;

			System.out.print("digite quantos valores queres: ");
			n = sc.nextInt();

			for (i = 1; i <= n; i++) {
				System.out.print("primeiro numero: ");
				x1 = sc.nextInt();
				System.out.print("dividido por: ");
				x2 = sc.nextInt();

				if (x2 == 0) {
					System.out.println("divisão impossível");
				} else {
					div = x1 / x2;
					System.out.printf("%.1f%n", div);
				}
			}
		}
	}

}