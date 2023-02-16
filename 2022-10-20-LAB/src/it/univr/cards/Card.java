package it.univr.cards;

import java.util.Random;

public class Card {

	private final Value value;	// Il valore della carte
	private final Suit suit;	// Il seme della carta

	/**
	 * Genera una carta a caso con un valore da min (incluso) in su.
	 * 
	 * @param min il valore minimo (0-12) della carta che può essere generata
	 */
	public Card(Value min) {
		this.value = Value.values()[random.nextInt(13 - min.ordinal()) + min.ordinal()];
		//random.nextInt(min.ordinal(), 13);
		this.suit = Suit.values()[random.nextInt(4)];
	}

	private final static Random random = new Random();

	//Genera una carta a caso con un valore da 0 (incluso) in su.
	public Card() {
		this(Value._2);
	}

	public Value getValue() {
		return value;
	}

	public Suit getSuit() {
		return suit;
	}

	
	//Ritorna una descrizione della carta sotto forma di stringa, del tipo 10♠ oppure J♥.
	public String toString() {
		String valueAsString, suitAsString;
		if (value.ordinal() <= 8)
			valueAsString = String.valueOf(value.ordinal() + 2);
		else if (value.ordinal() == 9)
			valueAsString = "J";
		else if (value.ordinal() == 10)
			valueAsString = "Q";
		else if (value.ordinal() == 11)
			valueAsString = "K";
		else
			valueAsString = "1";

		suitAsString = String.valueOf("♠♣♦♥".charAt(suit.ordinal()));
		
		return valueAsString + suitAsString;
	}

	/**
	 * Determina se questa carta è uguale ad other.
	 * 
	 * @param other l'altra carta con cui confrontarsi
	 * @return true se e solo se le due carte sono uguali
	 */
	public boolean equals(Card other) {
		return value == other.value && suit == other.suit;
	}
	
	public int compareTo(Card other) {
		int diff = value.compareTo(other.value);
		if (diff != 0)
			return diff;
		else
			return suit.compareTo(other.suit);
	}














}