import java.util.Locale;
import java.util.Scanner;

public class exs03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {

			int n, i;
			double x1, x2, x3, media;

			System.out.print("digite quantos valores queres: ");
			n = sc.nextInt();

			for (i = 1; i <= n; i++) {
				x1 = sc.nextDouble();
				x2 = sc.nextDouble();
				x3 = sc.nextDouble();

				media = ((x1 * 2) + (x2 * 3) + (x3 * 5)) / (2 + 3 + 5);
				System.out.printf("MEDIA: %.1f", media);
			}

			sc.close();

		}
	}
}
