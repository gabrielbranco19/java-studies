import java.util.Locale;
import java.util.Scanner;

public class exs2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// Locale para mudar na saída de dados a vírgula para ponto (padrão EUA) que separa a casa decimal.
		Scanner sc = new Scanner(System.in);
		
		// entrada de dados
		System.out.print("digite o valor do raio do círculo: ");
		double raio = sc.nextDouble();
		
		// processamento de dados
		double q = Math.pow(raio, 2); // Math.pow utiliza-se para elevar o número ao quadrado
		double pi = 3.14159;
		double area = pi * q;
		
		// saída de dados
		System.out.printf("valor da área = %.4f", area);
		// printf para permitir que eu possa formatar o numero com a quantidade de casas decimais que eu quiser
		// %.4f para mostrar 4 casas decimais
		
		sc.close();

	}

}