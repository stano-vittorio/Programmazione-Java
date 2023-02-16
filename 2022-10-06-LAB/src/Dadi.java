import java.util.Random;

public class Dadi {

	public static void main(String[] args) {
		
		Random random = new Random(); // creazione oggetto tipo random
		
		int d1 = 1 + random.nextInt(6); // dado 1
		int d2 = 1 + random.nextInt(6); // dado 2
		
		System.out.println("La somma dei dadi è: " + (d1 + d2)); // stampa finale somma
	}

}
