import java.util.Scanner;

/*
 * Si faccia la stessa cosa in ottale e in esadecimale.
 */

public class Esercizio3 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("Inserire un intero >= 0: ");
			n = keyboard.nextInt();
		} while(n < 0);
		keyboard.close();
		
		String result = "";
		String digits = "01234567";
		int nCpy = n;
		
		do {
			result = digits.charAt(nCpy % 8) + result;
			nCpy /= 8;
		} while(nCpy > 0);
		
		System.out.println("Base ottale: " + result);
		
		digits = "0123456789abcdef";
		result = "";
		
		do {
			result = digits.charAt(n % 16) + result;
			n /= 16;
		} while(n > 0);
		
		System.out.println("Base esadecimale: " + result);
	}
}
