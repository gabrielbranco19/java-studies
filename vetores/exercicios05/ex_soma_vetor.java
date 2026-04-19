import java.util.Locale;
import java.util.Scanner;

public class ex_soma_vetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers will you type? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		
		for (int i=0; i<n; i++) {
			
			System.out.print("Type a number: ");
			vect[i] = sc.nextInt();
		}

		int soma = 0;
		System.out.print("VALUES = ");
		for (int i=0; i<n; i++) {
			System.out.print(vect[i] + " ");
			soma += vect[i];
		}
		
		int media = soma/n;
		
		System.out.println();
		System.out.println("SOMA = " + soma);
		System.out.println("MEDIA = " + media);
		
		sc.close();

	}

}
