import java.util.Locale;
import java.util.Scanner;

public class exs06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite os três valores de um triângulo");
		System.out.print("A: ");
		double a = sc.nextDouble();
		System.out.print("B: ");
		double b = sc.nextDouble();
		System.out.print("C: ");
		double c = sc.nextDouble();
		
		double pi = 3.14159;
		double raio = Math.pow(c, 2);
		// eu atribui primeiramente os valores de pi e do raio para facilitar nos calculos em seguida
		
		double areatr = (a*c)/2;
		double areacirc = pi*raio;
		double areatrap = ((a+b)*c)/2;
		double areaquad = b*4;
		double arearet = a*b; 
		/* no exercicio, na area do retangulo, não estava especificando qual era base e altura.
		 * então fiz A multiplicado por B, entendendo que A é a base e B altura.
		*/
		
		System.out.printf("TRIÂNGULO = %.3f%n", areatr);
		System.out.printf("CIRCULO = %.3f%n", areacirc);
		System.out.printf("TRAPEZIO = %.3f%n", areatrap);
		System.out.printf("QUADRADO = %.3f%n", areaquad);
		System.out.printf("RETANGULO = %.3f%n", arearet);
		
		
		sc.close();
		
	}

}