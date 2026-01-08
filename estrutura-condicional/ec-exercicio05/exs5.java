import java.util.Locale;
import java.util.Scanner;

public class exs5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int qtd, cod;
		double total, cod1, cod2, cod3, cod4, cod5;
		
		cod1 = 4.00;
		cod2 = 4.50;
		cod3 = 5.00;
		cod4 = 2.00;
		cod5 = 1.50;
		// atribui os 5 códigos com seus preços respectivamente
		
		System.out.println("CARDÁPIO");
		System.out.println("Código ----- Especificação ----- Preço");
		System.out.println("1 ------ Cachorro-quente ------ R$ 4.00");
		System.out.println("2 ------ X-Salada ------ R$ 4.50");
		System.out.println("3 ------ X-Bacon ------ R$ 5.00");
		System.out.println("4 ------ Torrada simples ------ R$ 2.00");
		System.out.println("5 ------ Refrigerante ------ R$ 1.50");
		// aqui eu só fiz por uma questão de estética e interatividade
		System.out.println();
		System.out.println("Faça seu pedido");
		System.out.print("Código: ");
		cod = sc.nextInt();
		System.out.print("Quantidade: ");
		qtd = sc.nextInt();
		
		if (cod==1) {
			total = cod1*qtd;
			System.out.printf("Total: R$ %.2f", total);
		} else if (cod==2) {
			total = cod2*qtd;
			System.out.printf("Total: R$ %.2f", total);
		} else if (cod==3) {
			total = cod3*qtd;
			System.out.printf("Total: R$ %.2f", total);
		} else if (cod==4) {
			total = cod4*qtd;
			System.out.printf("Total: R$ %.2f", total);
		} else if (cod==5) {
			total = cod5*qtd;
			System.out.printf("Total: R$ %.2f", total);
		} else {
			System.out.print("Código inexistente!");
		}
		/*
		 * aqui é simples, se o código for igual ao número que o usuário escolheu, eu atribui o código respectivo ao numero escolhido
		 * e multipliquei pela quantidade escolhida também pelo usuário.
		 */
		
		sc.close();
	}

}
