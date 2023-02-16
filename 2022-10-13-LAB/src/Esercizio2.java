import java.util.Scanner;

/*
 * Si scriva un programma il cui main legge un intero non negativo da tastiera (se negativo, lo richiede ad oltranza) e lo trasforma in una stringa che rappresenta lo stesso numero in binario, che infine stampa. Per esempio, se viene immesso l'intero 123, deve costruire e poi stampare la stringa "1111011".
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
		
		String result = "";
		int numCopy = n;
		
		do {
			result = numCopy % 2 + result;
			numCopy /= 2;
		} while(numCopy > 0);
		
		System.out.println(n + " in binario si scrive " + result);
	}

}
