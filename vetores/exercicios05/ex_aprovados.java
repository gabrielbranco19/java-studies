import java.util.Locale;
import java.util.Scanner;

public class ex_aprovados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();
        sc.nextLine();

        double[] notaUm =  new double[n];
        double[] notaDois = new double[n];
        String[] nomes = new String[n];

        for (int i=0; i<n; i++) {
            System.out.println("Digite nome, primeira e segunda nota  do " +(i+1)+ "o aluno: ");
            nomes[i] = sc.nextLine();
            notaUm[i] = sc.nextDouble();
            notaDois[i] = sc.nextDouble();
            sc.nextLine();
        }

        for (int i=0; i<n; i++){
            double media = (notaUm[i]+notaDois[i])/2;
            if (media >= 6.0) {
                System.out.println("ALUNO APROVADO: " + nomes[i]);
            }
        }



    }
}
