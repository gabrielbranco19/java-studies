import java.util.Scanner;

public class ex_media_pares {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vect = new int[n];


        for (int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        double soma = 0;
        double media = 0;
        for (int i=0; i<n; i++) {
            if (vect[i] % 2 == 0) {
                soma +=  vect[i];
                media++;
            }
        }

        media = soma/media;

        if (soma > 0) {
            System.out.println("MEDIA DOS PARES: " + media);
        } else  {
            System.out.println("NENHUM NUMERO PAR");
        }


    }
}
