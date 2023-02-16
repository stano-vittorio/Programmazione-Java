import java.util.Scanner;

/*
 * Si scriva un programma che legge n >= 1 da tastiera e stampa una piramide di larghezza n. Per esempio, per n = 4 deve stampare:

       @
      @@
     @@@
	@@@@
	 @@@
	  @@
	   @
 */

public class Esercizio6 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("Inserire un numero >= 1: ");
			n = keyboard.nextInt();
		} while(n < 1);
		keyboard.close();
		
		String row = "@";
		for(int i = 0; i < n - 1; i++) {
			row = " " + row;
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(row);
			row = row.substring(1) + "@";
		}
		
		for(int i = 0; i < n - 1; i++) {
			row = row.substring(0, row.length()-1);
			row = " " + row;
			System.out.println(row);
		}

	}

}
