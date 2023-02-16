package it.univr.numbers;

public abstract class AbstractNumber implements Number {
	
	private final int value;
	
	// se value è negativo, esegue throw new IllegalArgumentException();
	// altrimenti inizializza il campo value
	protected AbstractNumber(int value) {
		
		if(value < 0) {
			throw new IllegalArgumentException();
		} else {
			this.value = value;
		}
	}
	
	//restituisce il valore di questo numero
	public int getValue() {
		return value;
	}
	
	//restituisce la base di numerazione di questo numero
	protected abstract int getBase();
	
	// restituisce il carattere che rappresenta la cifra "digit" nella base di numerazione
	// di questo numero. Sarà sempre vero che 0 <= digit < getBase();
	// per esempio, in base sedici si avrà getCharForDigit(10) == 'A' e
	// in base otto si avrà getCharForDigit(7) == '7'
	protected abstract char getCharForDigit(int digit);
	
	//restituisce una stringa che rappresenta il numero nella sua base di numerazione
	public String toString() {
		
		String result = "";
		int v = value;
		int base = getBase();
		
		do {
			result = getCharForDigit(v % base) + result;
			v /= base;
		} while(v > 0);
		
		return result;
	}
	
	//due numeri sono uguali <--> hanno lo stesso valore
	public final boolean equals(Object other) {
		return other instanceof Number && value == ((Number)other).getValue();
	}
}
