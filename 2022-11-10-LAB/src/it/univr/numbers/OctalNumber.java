package it.univr.numbers;

public class OctalNumber extends AbstractNumber {

	protected OctalNumber(int value) {
		super(value);
	}

	protected int getBase() {
		return 8;
	}

	protected char getCharForDigit(int digit) {
		return "01234567".charAt(digit);
	}
}
