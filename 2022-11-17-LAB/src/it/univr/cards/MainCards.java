package it.univr.cards;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainCards {

	public static void main(String[] args) {
		
		System.out.print("HashSet...");
		Set<Card> set1 = new HashSet<Card>();
		statistiche(set1);
		
		System.out.print("TreeSet...");
		Set<Card> set2 = new TreeSet<Card>();
		statistiche(set2);
		
		System.out.println("Sono equals? " + set1.equals(set2));
	}
	
	private static void statistiche(Set<Card> set) {
		
		long timeStart = System.currentTimeMillis();
		
		for(int i = 0; i < 100000000; i++) {
			set.add(new Card());
		}
		
		long timeEnd = System.currentTimeMillis();
		
		System.out.printf(" --> time = %.3f", (timeEnd - timeStart)/1000.0);
		System.out.print(" --> size: " + set.size() + "\n");
	}
}
