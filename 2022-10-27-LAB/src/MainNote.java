import it.univr.notes.Duration;

import it.univr.notes.EnglishNote;
import it.univr.notes.ItalianNote;
import it.univr.notes.ItalianNoteWithDuration;
import it.univr.notes.Note;

public class MainNote {

	public static void main(String[] args) {
	
		Note n1 = new Note(5);
		Note n2 = new ItalianNote(7);
		Note n3 = new ItalianNoteWithDuration(6, Duration.MINIMA);
		
		System.out.println(n1.toString());
		System.out.println(n2.toString());
		System.out.println(n3.toString());
		
		System.out.println("n3 ha semitono: " + n3.getSemitone());
		System.out.println("n3 ha durata: " + ((ItalianNoteWithDuration) n3).getDuration());
		
		boolean e1 = n1.equals(new Note(5));
		System.out.println("e1 = " + e1);
		boolean e2 = n1.equals("ciao");
		System.out.println("e2 = " + e2);
		boolean e3 = n1.equals(new ItalianNote(5));
		System.out.println("e3 = " + e3);
	}

}
