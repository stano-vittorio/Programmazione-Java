import java.util.Scanner;

public class Pitagora {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); // creo oggetto scanner
		double cateto1, cateto2;
		
		do { // richiesta primo valore
			System.out.println("Inserisci il primo cateto:");
			cateto1 = keyboard.nextDouble();
		} while(cateto1 < 0);
		
		do { // richiesta secondo valore
			System.out.println("Inserisci il secondo cateto:");
			cateto2 = keyboard.nextDouble();
		} while(cateto2 < 0);
		
		// calcolo ipotenusa
		double ipotenusa = Math.sqrt((cateto1*cateto1) + (cateto2*cateto2));
		
		// stampa finale
		System.out.format("Il triangolo di cateti %.2f e %.2f ha ipotenusa %.2f", cateto1, cateto2, ipotenusa);
		keyboard.close(); // chiudo scanner
	}

}
