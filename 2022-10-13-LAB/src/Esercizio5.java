import java.util.Scanner;

/*
 * Si scriva un programma Java che legge una frase da tastiera e determina se tale frase è palindroma.
 */

public class Esercizio5 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Inserire stringa: ");
		String s = keyboard.nextLine();
		keyboard.close();
		
		boolean isPalindrome = true;
		
		for (int sx = 0, dx = s.length() - 1; sx < dx; sx++, dx--) {
			
			if(s.charAt(sx) != s.charAt(dx)) {
				isPalindrome = false;
				break;
			}
		}
		
		if (isPalindrome == true)  {
			System.out.println("\"" + s + "\" è palindroma");
		} else {
			System.out.println("\"" + s + "\" non è palindroma");
		}
	}

}
