package it.univr.numbers;

public class BinaryNumberWithParity extends BinaryNumber {

	protected BinaryNumberWithParity(int value) {
		super(value);
	}
	
	public String toString() {
		String result = super.toString(); // come in BinaryNumber
		
		int counter = 0;
		for(int i = 0; i < result.length(); i++) {
			
			if(result.charAt(i) == '1') {
				counter++;
			}
		}
		
		if(counter % 2 == 0) {
			return result + '0';
		} else {
			return result + '1';
		}
	}
}
