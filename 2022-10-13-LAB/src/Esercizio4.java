import java.util.Scanner;

/*
 * Si faccia la stessa cosa in Base58, che è una numerazione le cui cifre sono le cifre arabe da 1 a 9, seguite dalle lettere alfabetiche maiuscole (tranne O e I) e poi dalle lettere alfabetiche minuscole (tranne la l).
 */

public class Esercizio4 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("Inserire un numero non negativo: ");
			n = keyboard.nextInt();
		} while(n < 0);
		keyboard.close();
		
		String result = "";
		String digits = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz";
		int numCopy = n;
		
		do {
			result = digits.charAt(numCopy % 58) + result;
			numCopy /= 58;
		} while(numCopy > 0);
		
		System.out.println(n + " in base58 si scrive " + result);
	}

}
