import java.util.Scanner;

public class exs02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("digite um valor inteiro: ");
		int n = sc.nextInt();
		
		int somain=0, somaout=0;
		
		
		for (int i=1; i<=n; i++) { /* contagem começa do 1 em diante, repete enquanto i for menor que n que foi digitado 
		 							anteriormente do for e para as somas, caso estiver nos intervalos 10,20, somar 1 em cada,
		 							assim como o que está fora do intervalo e imprimir quando acabar a repetição.*/
			System.out.print("outro valor: ");
			int x = sc.nextInt();
			
			if (x>=10 && x<=20) {
				somain += 1;
			} else {
				somaout += 1;
			}
			
		}
		
		System.out.println("in: " + somain);
		System.out.println("out: " + somaout);
		
		sc.close();

	}

}
