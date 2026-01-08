import java.util.Scanner;

public class exs2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n;
		
		System.out.print("digite um número: ");
		n = sc.nextInt();
		
		if (n%2==0) {
			System.out.print(n + " é par!");
		} else {
			System.out.print(n+ " é impar!");
		}

		sc.close();
	}

}
