import java.util.Scanner;

public class exs01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("digite um valor inteiro: ");
		int x = sc.nextInt();

		for (int i = 1; i <= x; i++) { /*contagem começa em 1, condição da repetição ocorrerá enquanto i for menor ou
										igual a x e i++ para contar +1 na contagem, porém, só irá imprimir os numeros IMPARES*/

			if (i % 2 == 1) { // vai imprimir i SE, divido por 2, o resto resultar em 1 (numero impar)
				System.out.println(i);
			}
		}

		sc.close();

	}

}