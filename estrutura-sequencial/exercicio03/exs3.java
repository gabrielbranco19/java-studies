import java.util.Scanner;

public class exs3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 4 valores inteiros");
		System.out.println(); // fiz essa quebra de linha por estética
		System.out.print("A: ");
		int a = sc.nextInt();
		System.out.print("B: ");
		int b = sc.nextInt();
		System.out.print("C: ");
		int c = sc.nextInt();
		System.out.print("D: ");
		int d = sc.nextInt();
		
		int dif = (a*b) - (c*d);
		
		System.out.print("DIFERENÇA = " + dif);
		
		sc.close();
	}

}