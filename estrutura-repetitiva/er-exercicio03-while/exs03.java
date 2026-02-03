import java.util.Scanner;

public class exs03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. Álcool");
		System.out.println("2. Gasolina");
		System.out.println("3. Diesel");
		System.out.println("4. Fim");
		System.out.println("escolha o combustível: ");
		int x = sc.nextInt();

		int salcool = 0, sgasolina = 0, sdiesel = 0; // declarando 0 para a soma de cada combustivel

		while (x != 4) { //repetir sempre que for diferente da opção 4, caso contrário, o programa termina

			switch (x) { //optei pelo switch por ser mais prático e simples

			case 1:
				salcool += 1; //simplificando o código que é o mesmo que salcool = salcool + 1
				System.out.println("escolha o combustível: ");
				x = sc.nextInt();
				break;
			case 2:
				sgasolina += 1;
				System.out.println("escolha o combustível: ");
				x = sc.nextInt();
				break;
			case 3:
				sdiesel += 1;
				System.out.println("escolha o combustível: ");
				x = sc.nextInt();
				break;
			case 4:
				break;
			default:
				System.out.println("número inválido! tente novamente...");
				System.out.println("escolha o combustível: ");
				x = sc.nextInt();
				break;
			}

		}
		
		System.out.println("Alcool: " + salcool);
		System.out.println("Gasolina: " + sgasolina);
		System.out.println("Diesel: " + sdiesel);

		sc.close();

	}

}