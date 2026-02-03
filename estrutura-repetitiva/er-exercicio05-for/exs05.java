import java.util.Scanner;

public class exs05 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
		
			System.out.print("digite um valor inteiro: ");
			int n = sc.nextInt();
			
			int i, fatorial=1;
			
			for (i=n; i>=1; i--) {
				System.out.println(i);
				fatorial *= i;
			}
			
			System.out.println(fatorial);
			
		}

	}

}
