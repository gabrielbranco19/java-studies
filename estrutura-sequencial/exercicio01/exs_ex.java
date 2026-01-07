import java.util.Scanner;
// sem importar o Scanner NÃO funciona!

public class exs_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// inicialização do Scanner para entrada de dados
		
		System.out.print("Enter the first value: ");
		int a = sc.nextInt();
		System.out.print("Enter the second value: ");
		int b = sc.nextInt();
		// entrada de dados
		
		int soma = a + b;
		// processamento de dados
		
		System.out.print("SOMA = " + soma);
		// saída de dados
		
		sc.close();
		// fechamento do Scanner pois não será mais usado

	}

}