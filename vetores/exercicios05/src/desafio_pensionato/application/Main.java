package application;

import entities.Rent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rent[] quartos = new Rent[10];

        System.out.print("Quantos quartos serão alugados? ");
        int q = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < q; i++){
            System.out.println("Aluguel #" + (i+1));
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int numQuarto = sc.nextInt();
            sc.nextLine();
            quartos[numQuarto] =  new Rent(name, email);
        }

        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < 10; i++){
            if(quartos[i] != null){
                System.out.println(i +": " + quartos[i]);
            }
        }

    }
}