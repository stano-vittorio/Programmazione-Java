package it.univr.cards;

import java.util.SortedSet;
import java.util.TreeSet;

public class Deck {

	private final SortedSet<Card> cards = new TreeSet<>();

	/**
	 * Costruisce un mazzo di size carte, tutte diverse, il cui valore è da min in su.
	 */
	public Deck(int size, Value min) {
		while(cards.size() < size) {
			cards.add(new Card(min));
		}
	}

	/**
	 * Restituisce una stringa che descrive le carte in questo mazzo, costruita come la loro stampa in sequenza crescente per valore.
	 */
	public String toString() {
		return cards.toString();
	}

	/**
	 * Restituisce la carta più alta di questo mazzo (senza rimuoverla).
	 */
	public Card best() {
		return cards.last();
	}

	/**
	 * Rimuove la carta più alta di questo mazzo.
	 */
	public void removeBest() {
		cards.remove(best());
	}
}