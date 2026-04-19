import java.util.Scanner;

public class ex_maior_posicao {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Quantos numeros vc vai digitar? ");
	        int n =  sc.nextInt();

	        int[] valor = new int[n];

	        double maior = valor[0];
	        int posicao = 0;

	        for (int i=0; i<n; i++) {
	            System.out.print("Digite um numero: ");
	            valor[i] = sc.nextInt();
	            if (valor[i] > maior) {
	                maior = valor[i];
	                posicao = i;
	            }
	        }

	        System.out.println("MAIOR VALOR = " + maior);
	        System.out.println("POSIÇÃO DO MAIOR = " + posicao);
	        
	        sc.close();

	}

}
