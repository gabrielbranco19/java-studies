import java.util.Locale;
import java.util.Scanner;

public class ex_abaixo_da_media {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] num = new double[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            num[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i=0; i<n; i++) {
            soma += num[i];
        }

        double media =  soma / n;
        System.out.println("MEDIA DO VETOR = " + media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i=0; i<n; i++) {
            if (num[i] < media) {
                System.out.println(num[i]);
            }
        }

    }
}
