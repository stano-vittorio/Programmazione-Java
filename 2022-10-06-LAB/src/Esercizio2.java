import java.util.Scanner;

/*
 * Si scriva un programma Java che legge un intero non negativo n da tastiera e stampa una cornice n x n:

	@@@@@
	@   @
	@   @
	@   @
	@@@@@
 */

public class Esercizio2 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("Inserire un numero non negativo: ");
			n = keyboard.nextInt();
		} while(n < 0);
		keyboard.close();
		
		String topDown = "";
		for(int i = 0; i < n; i++) {
			topDown += "@";
		}
		
		String inner = "";
		for(int i = 0; i < n - 2; i++) {
			inner += " ";
		}
		inner = "@" + inner + "@";
		
		System.out.println(topDown);
		
		for(int i = 0; i < n - 2; i++) {
			System.out.println(inner);
		}
		
		if(n > 1) {
			System.out.println(topDown);
		}

	}

}
