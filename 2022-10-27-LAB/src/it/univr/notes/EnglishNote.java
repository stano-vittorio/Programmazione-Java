package it.univr.notes;

public class EnglishNote extends Note {
	
	public EnglishNote(int semitone) {
		super(semitone);
		// TODO Auto-generated constructor stub
	}

	private final static String[] name = 
		{"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
	
	// toString + ctrl + spazio --> implementazione automatica
	public String toString() {
		return name[getSemitone()];
	}
}
