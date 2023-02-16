// Si scriva un programma che stampa 26 volte la cornice 10 x 10, usando ogni volta un carattere alfabetico diverso al posto di '@', dalla 'a' alla 'z'.

public class Esercizio4 {

	public static void main(String[] args) {
		
		for(char c = 'a'; c <= 'z'; c++) {
			
			int n = 10;
			
			String topDown = "";
			for(int i = 0; i < n; i++) {
				topDown += c;
			}
			
			String inner = "";
			for(int i = 0; i < n - 2; i++) {
				inner += " ";
			}
			inner = c + inner + c;
			
			System.out.println(topDown);
			
			for(int i = 0; i < n - 2; i++) {
				System.out.println(inner);
			}
			
			System.out.println(topDown);
		}

	}

}
