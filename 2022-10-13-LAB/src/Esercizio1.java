import java.util.Random;
import java.util.Scanner;

/*
 * Si scriva un programma che legge un intero n non negativo da tastiera (se negativo, lo richiede ad oltranza), crea un array di n interi casuali tra 0 (incluso) ed n (escluso) e infine stampa l'array e la somma dei suoi elementi.
 */

public class Esercizio1 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int n, sum = 0;
		
		do {
			System.out.print("Inserire un numero non negativo: ");
			n = keyboard.nextInt();
		} while(n < 0);
		keyboard.close();
		
		Random random = new Random();
		
		int[] array = new int[n];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(0, n);
		}
		
		for(int arr: array) {
			sum += array[arr];
			System.out.print(array[arr] + " ");
		}
	
		System.out.println("\nSomma = " + sum);
	}

}
