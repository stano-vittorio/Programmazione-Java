package it.univr.cards;

import java.util.Random;

public class Card implements Comparable<Card> {

  /**
   * Il valore della carta.
   */
  private final Value value;

  /**
   * Il seme della carta.
   */
  private final Suit suit;
 
  /**
   * Genera una carta a caso con un valore da min (incluso) in su.
   * 
   * @param min il valore minimo della carta che può essere generata (0-12)
   */
  public Card(Value min) {
	  int minAsInt = min.ordinal();
	  Random random = new Random();
	  // 13 - min alternative, cominciando da min
	  this.value = Value.values()
			  [random.nextInt(13 - minAsInt) + minAsInt];
	  this.suit = Suit.values()[random.nextInt(4)];
  }
  
  /**
   * Genera una carta a caso con un valore da 0 (incluso) in su.
   */
  public Card() {
	  this(Value._2);
  }
 
  public Value getValue() {
	  return value;
  }
 
  public Suit getSuit() {
	  return suit;
  }

  /**
   * Ritorna una descrizione della carta sotto forma di stringa, del tipo 10♠ oppure J♥.
   */
  public String toString() {
	  String values = "23456789 JQK1";
	  String valueAsString;
	  if (value.ordinal() == 8)
		  valueAsString = "10";
	  else
		  valueAsString = String.valueOf(values.charAt(value.ordinal()));

	  String suits = "♠♣♦♥";
	  String suitAsString = String.valueOf(suits.charAt(suit.ordinal()));

	  return valueAsString + suitAsString;
  }
 
  public int compareTo(Card other) {
	  int diff = value.compareTo(other.value);
	  if (diff != 0)
		  return diff;
	  else
		  return suit.compareTo(other.suit);
  }

  /**
   * Determina se questa carta è uguale ad other.
   * 
   * @param other l'altra carta con cui confrontarsi
   * @return true se e solo se le due carte sono uguali
   */
  public boolean equals(Object other) {
	  return other instanceof Card &&
			  this.value == ((Card) other).value && this.suit == ((Card) other).suit;
  }
  
  public int hashCode() {
	  return value.ordinal() * suit.ordinal(); 
  }
}
