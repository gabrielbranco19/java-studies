import java.util.Scanner;

public class exs3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a, b;
		
		System.out.println("Digite dois valores inteiros");
		System.out.print("A: ");
		a = sc.nextInt();
		System.out.print("B: ");
		b = sc.nextInt();
		
		int opcaoa = a%b;
		int opcaob = b%a;
		/* fiz primeiro a conta do mod (resto) para colocar a condição no if, se caso o resto for 0, os numeros são multiplos, 
		caso contrario, não são
		*/ 
		
		if (opcaoa==0 || opcaob==0) { //condição ou (||) para que seja possivel usar o numero maior primeiro ou depois.
			System.out.print("São multiplos.");
		} else {
			System.out.print("não são multiplos.");
		}

		sc.close();
	}
	
}