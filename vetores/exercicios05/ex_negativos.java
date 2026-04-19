import java.util.Scanner;

public class ex_negativos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("quantos numeros voce vai digitar? (max. 10) ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS");
		for (int i=0; i<n; i++) {
			if (vect[i]<0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();

	}

}
