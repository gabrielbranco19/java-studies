import java.util.Scanner;

public class ex_mais_velho {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas vc vai digitar? ");
        int n = sc.nextInt();

        int[] idade = new int[n];
        String[] nome = new String[n];


        for (int i=0; i<n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:" );
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }

        int maiorIdade = idade[0];
        String maisVelho = nome[0];
        for (int i=0; i<n; i++) {
            if (idade[i] > maiorIdade) {
                maiorIdade = idade[i];
                maisVelho = nome[i];
            }
        }

        System.out.println("Pessoa mais velha: " + maisVelho);

    }
}
