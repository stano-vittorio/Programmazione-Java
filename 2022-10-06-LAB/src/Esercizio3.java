// Si scriva un programma che stampa, una dopo l'altra, nove cornici, da quella 2 x 2 a quella 10 x 10.

public class Esercizio3 {

	public static void main(String[] args) {
		
		for(int n = 2; n <= 10; n++) {
			
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
			
			System.out.println(topDown);
		}

	}

}
