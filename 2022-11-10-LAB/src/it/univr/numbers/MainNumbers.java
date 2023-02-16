package it.univr.numbers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainNumbers {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("Inserisci n >= 0: ");
			n = keyboard.nextInt();
		} while(n < 0);
		keyboard.close();
		
		Number n10 = new DecimalNumber(n);
		System.out.println(n10);
		
		Number n2 = new BinaryNumber(n);
		System.out.println(n2);
		
		Number n2p = new BinaryNumberWithParity(n);
		System.out.println(n2p);
		
		Number n8 = new OctalNumber(n);
		System.out.println(n8);
		
		Number n16 = new HexNumber(n);
		System.out.println(n16);
		
		Number n58 = new Base58Number(n);
		System.out.println(n58);
		
		List<Number> l1 = new ArrayList<Number>();
		l1.add(n10);
		l1.add(n2);
		l1.add(n2p);
		l1.add(n8);
		l1.add(n16);
		l1.add(n58);
		System.out.println(l1);
		
		List<Number> l2 = new LinkedList<Number>();
		l2.add(n10);
		l2.add(n2);
		l2.add(n2p);
		l2.add(n8);
		l2.add(n16);
		l2.add(n58);
		System.out.println(l2);
	}

}
