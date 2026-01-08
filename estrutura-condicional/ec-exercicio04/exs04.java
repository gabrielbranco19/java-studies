import java.util.Scanner;

public class exs04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int hi, hf;
		
		System.out.print("Hora inicial do jogo: ");
		hi = sc.nextInt();
		System.out.print("Hora final do jogo: ");
		hf = sc.nextInt();
		System.out.println();
		
		if (hi>hf) {
			int total = 24-(hi-hf); 
			/* 
			 * se a hora inicial for maior que a final, sabendo-se que o dia tem 24h, subtrai as 24h pela subtração da incial e final
			 * entendendo que o jogo vai durar de um dia para o outro.
			 */
			System.out.print("O jogo durou " + total + " horas.");
		} else if (hf>hi) {
			/*
			 * se a hora final for maior que a final, só subtrair o horario final pelo inicial, entendendo-se que o jogo acabou
			 * no mesmo dia.
			 */
			int total = hf-hi;
			System.out.print("O jogo durou " + total + " horas.");
		} else {
			/*
			 * aqui é auto-explicativo, se a incial não for maior e nem menor que a final, é pq os numeros serão iguais, logo,
			 * o jogo durou 24h
			 */
			System.out.print("O jogo durou 24 horas.");
		}
		
		sc.close();
	}

}