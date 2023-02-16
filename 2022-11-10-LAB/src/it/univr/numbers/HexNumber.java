package it.univr.numbers;

public class HexNumber extends AbstractNumber {

	protected HexNumber(int value) {
		super(value);
	}

	protected int getBase() {
		return 16;
	}

	protected char getCharForDigit(int digit) {
		return "0123456789ABCDEF".charAt(digit);
	}
}
