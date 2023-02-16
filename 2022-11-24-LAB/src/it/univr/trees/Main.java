package it.univr.trees;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BTree bt = new BTree();

		try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("data/values.txt")))) {
			while (scanner.hasNextInt())
				bt.add(scanner.nextInt());
		} catch (IOException e) {
			System.out.println("Il file data/values.txt non esiste");
		}

		System.out.println(bt.size());

		try {
			bt.dumpAsXML("data/tree.xml");
		} catch (IOException e) {
			System.out.println("Il file data/tree.xml non è scrivibile");
		}
	}
}
