package it.univr.numbers;

public class BinaryNumber extends AbstractNumber {

	protected BinaryNumber(int value) {
		super(value);
	}
	
	protected int getBase() {
		return 2;
	}
	
	protected char getCharForDigit(int digit) {
		return "01".charAt(digit);
	}
}
