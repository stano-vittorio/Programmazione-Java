package it.univr.notes;

public class Song {
	private final String lyrics;
	private final Note[] notes;

	/**
	 * @param lyrics è il testo della canzone (una riga)
	 */
	public Song(String lyrics) {
		this.lyrics = lyrics;
		this.notes = new Note[lyrics.length()];
	}

	/**
	 * Posiziona una nota sopra il carattere position dell'unica riga della canzone.
	 */
	public void place(Note note, int position) {
		notes[position] = note;
	}

	/**
	 * Restituisce una stringa di due righe: nella prima riga sono riportate le note posizionate nella canzone,
	 * nella seconda riga è riportato il testo della canzone.
	 */
	public String toString() {
		String first = "";
		while (first.length() < lyrics.length())
			first += noteAsString(first.length());

		return first + "\n" + lyrics;
	} 
	
	private String noteAsString(int position) {
		if (notes[position] == null)
			return " ";
		else
			return notes[position].toString();
	}
}