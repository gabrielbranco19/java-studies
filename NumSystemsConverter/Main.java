import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("CONVERSOR BÁSICO DE SISTEMAS DE NUMERAÇÃO");
        System.out.println("-".repeat(50));
        System.out.println("1. decimal");
        System.out.println("2. hexadecimal");
        System.out.println("3. binário");
        System.out.println("-".repeat(50));
        System.out.println();
        System.out.println("Escolha o sistema de numeração que quer converter:");
        int sistemaOrigem =  sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o número: ");
        String num = sc.nextLine();

        Converter converter = new Converter();

        if  (sistemaOrigem == 1) {
            System.out.println();
            System.out.println("-".repeat(50));
            System.out.println("2. hexadecimal");
            System.out.println("3. binário");
            System.out.println("-".repeat(50));
            System.out.println();
            System.out.println("Quer converter para qual sistema de numeração? ");
            int sistemaDestino = sc.nextInt();
            sc.nextLine();
            switch (sistemaDestino) {
                case 2:
                    System.out.println(converter.convertDecHex(num));
                    break;
                case 3:
                    System.out.println(converter.convertDecBin(num));
                    break;
            }
        } else if (sistemaOrigem == 2) {
            System.out.println();
            System.out.println("-".repeat(50));
            System.out.println("1. decimal");
            System.out.println("3. binário");
            System.out.println("-".repeat(50));
            System.out.println();
            System.out.println("Quer converter para qual sistema de numeração? ");
            int sistemaDestino = sc.nextInt();
            sc.nextLine();
            switch (sistemaDestino) {
                case 1:
                    System.out.println(converter.convertHexDec(num));
                    break;
                case 3:
                    System.out.println(converter.convertHexBin(num));
                    break;
            }
        } else if (sistemaOrigem == 3) {
            System.out.println();
            System.out.println("-".repeat(50));
            System.out.println("1. decimal");
            System.out.println("2. hexadecimal");
            System.out.println("-".repeat(50));
            System.out.println();
            System.out.println("Quer converter para qual sistema de numeração? ");
            int sistemaDestino = sc.nextInt();
            sc.nextLine();
            switch (sistemaDestino) {
                case 1:
                    System.out.println(converter.convertBinDec(num));
                    break;
                case 2:
                    System.out.println(converter.convertBinHex(num));
                    break;
            }
        } else {
            System.out.println("Número inválido. Tente novamente.");
        }
        
    }
}
