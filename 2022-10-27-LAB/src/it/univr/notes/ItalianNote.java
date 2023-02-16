package it.univr.notes;

public class ItalianNote extends Note{
	
	public ItalianNote(int semitone) {
		super(semitone);
		// TODO Auto-generated constructor stub
	}

	private final static String[] name =
		{"do", "do#", "re", "re#", "mi", "fa", "fa#", "sol", "sol#", "la", "la#", "si"};
	
	// toString + ctrl + spazio --> implementazione automatica
	public String toString() {
		return name[getSemitone()];
	}
	
	public String foo() {
		return "Ciao, sono ItalianNote!";
	}
}
