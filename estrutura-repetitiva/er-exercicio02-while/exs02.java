import java.util.Scanner;

public class exs02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Considere Q1 | Q2 ");
		System.out.println("Considere Q3 | Q4 ");
		
		System.out.print("Digite o valor de X: ");
		int x = sc.nextInt();
		System.out.print("Digite o valor de Y: ");
		int y = sc.nextInt();

		while (x != 0 && y != 0) {
			
			if (x < 0 && y > 0) {
				System.out.println("primeiro quadrante");
			} else if (x > 0 && y > 0) {
				System.out.println("segundo quadrante");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro quadrante");
			} else if (x > 0 && y < 0) {
				System.out.println("quarto quadrante");
			} 
			
			System.out.print("Digite o valor de X: ");
			x = sc.nextInt();
			System.out.print("Digite o valor de Y: ");
			y = sc.nextInt();
		}

		sc.close();
	}

}
