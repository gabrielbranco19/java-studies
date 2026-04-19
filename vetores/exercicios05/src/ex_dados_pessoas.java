import java.util.Locale;
import java.util.Scanner;

public class ex_dados_pessoas {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        double[] altura = new double[n];
        String[] genero = new String[n];


        for (int i=0; i<n; i++) {
            System.out.print("Altura da "+(i+1)+"a pessoa: ");
            altura[i] = sc.nextDouble();
            sc.nextLine();
            System.out.print("Genero da "+(i+1)+"a pessoa: ");
            genero[i] = sc.nextLine();
        }

        double maiorAltura = 0;
        for (int i=0; i<n; i++) {
            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }
        }
        System.out.println("Maior altura: " + maiorAltura);

        double menorAltura = altura[0];
        for (int i=0; i<n; i++) {
            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
        }
        System.out.println("Menor altura: " + menorAltura);


        double soma = 0;
        int totalMulheres = 0;
        for (int i=0; i<n; i++) {
            if (genero[i].equals("F")) {
                soma += altura[i];
                totalMulheres++;
            }
        }
        double media =  soma/totalMulheres;
        System.out.printf("Media das alturas das mulheres: %.2f\n", media);

        int homens = 0;
        for (int i=0; i<n; i++) {
            if (genero[i].equals("M")) {
                homens += 1;
            }
        }
        System.out.println("Homens: "+homens);


    }
}
