package it.univr.trees;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BTree {
	private Node root;

	public void add(int value) {
		if (root == null)
			root = new Node(value);
		else
			root.add(value);
	}

	public int size() {
		if (root != null) {
			return root.size();
		} else {
			return 0;
		}
	}

	public void dumpAsXML(String fileName) throws IOException {

		try (Writer writer = new BufferedWriter(new FileWriter(fileName))) {
			writer.write("<binary-tree>\n");

			if (root != null) {
				root.dumpAsXML("root", "  ", writer);
			}
			writer.write("</binary-tree>\n");
		}
	}

	private static class Node {
		private final int value;
		private Node left;
		private Node right;

		public Node(int value) {
			this.value = value;
		}

		private void dumpAsXML(String tag, String nesting, Writer writer) throws IOException {
			writer.write(nesting + "<" + tag + " value = \"" + value + "\">\n");

			if (left != null) {
				left.dumpAsXML("left-subtree", nesting + "  ", writer);
			}
			if (right != null) {
				right.dumpAsXML("right-subtree", nesting + "  ", writer);
			}
			writer.write(nesting + "</" + tag + ">\n");
		}

		private int size() {
			int count = 1;

			if (left != null) {
				count += left.size();
			}
			if (right != null) {
				count += right.size();
			}
			return count;
		}

		private void add(int added) {
			if (added < value)
				if (left == null)
					left = new Node(added);
				else
					left.add(added);
			else if (added > value)
				if (right == null)
					right = new Node(added);
				else
					right.add(added);
		}
	}
}