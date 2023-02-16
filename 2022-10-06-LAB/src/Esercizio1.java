import java.util.Scanner;
import java.util.Random;

public class Esercizio1 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		long n;
		
		do {
			System.out.println("Inserisci un numero non negativo:");
			n = keyboard.nextLong();
		} while(n < 0);
		
		Random random = new Random();
		double num1, num2;
		long dentro = 0;
		
		for(long i = 0; i < n; i++) {
			num1 = random.nextDouble(-1, 1);
			num2 = random.nextDouble(-1, 1);
			
			double d = (num1 * num1) + (num2 * num2);
			
			if(d <= 1) {
				dentro++;
			}
		}
		
		System.out.println("Il valore della formula è " + ((dentro * 4)/n));
		keyboard.close();
	}

}
