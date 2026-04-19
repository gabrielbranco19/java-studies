import java.util.Locale;
import java.util.Scanner;

public class ex_alturas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i=0; i<n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa: ");
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i=0; i<n; i++) {
            soma += altura[i];
        }
        double media = soma/n;
        System.out.println();
        System.out.printf("Altura média: %.2f%n",media);

        int menores = 0;
        for (int i=0; i<n; i++) {
            if (idade[i]<16) {
                menores++;
            }
        }
        double percentual = ((double)menores*100)/n;
        // cast para o resultado da divisão retornar como numero flutuante

        System.out.printf("pessoas menores de 16 ano: %.1f%%%n", percentual);

        for (int i=0; i<n; i++) {
            if (idade[i] < 16) {
                System.out.println(nome[i]);
            }
        }
        
    }
}