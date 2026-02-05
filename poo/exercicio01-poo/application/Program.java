package application;


import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle; 

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle(); //importando a classe Rectangle com o nome "rectangle", assim como faz com o Scanner.s
		
		System.out.println("Enter rectangle width and height: ");
		System.out.print("Width = ");
		rectangle.width = sc.nextDouble();
		
		System.out.print("Height = "); 
		rectangle.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rectangle.Area());
		System.out.printf("PERIMETER = %.2f%n", rectangle.Perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.Diagonal());
		
		
		sc.close();

	}

}
