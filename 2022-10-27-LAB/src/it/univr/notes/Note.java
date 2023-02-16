package it.univr.notes;

public class Note {
	private final int semitone;
	
	public Note(int semitone) {
		this.semitone = semitone;
		
		if (semitone < 0 || semitone > 11)
			System.out.println("illegal semitone");
	}
	
	public final int getSemitone() {
		return semitone;
	}
	
	public String toString() {
		return "nota di semitono " + semitone;
	}

	public boolean equals(Object other) {
		if (!(other instanceof Note))
			return false;
		else if (semitone != ((Note) other).semitone)
			return false;
		else {
			boolean thisHasDuration = hasDuration();
			boolean otherHasDuration = ((Note) other).hasDuration();
			
			if (thisHasDuration != otherHasDuration)
				return false;
			else if (!thisHasDuration && !otherHasDuration)
				return true;
			else {
				Duration durationOfThis = this instanceof ItalianNoteWithDuration ?
						((ItalianNoteWithDuration) this).getDuration() :
						((EnglishNoteWithDuration) this).getDuration();
				Duration durationOfOther = other instanceof ItalianNoteWithDuration ?
						((ItalianNoteWithDuration) other).getDuration() :
						((EnglishNoteWithDuration) other).getDuration();
				
				return durationOfThis == durationOfOther;
			}
		}
	}

	private boolean hasDuration() {
		return this instanceof ItalianNoteWithDuration || this instanceof EnglishNoteWithDuration;
	}

	public int compareTo(Note other) {
		if (semitone != other.semitone)
			return semitone - other.semitone;
		else {
			boolean thisHasDuration = hasDuration();
			boolean otherHasDuration = other.hasDuration();
			
			if (!thisHasDuration && otherHasDuration)
				return -1;
			else if (thisHasDuration && !otherHasDuration)
				return 1;
			else if (!thisHasDuration && !otherHasDuration)
				return 0;
			else {
				Duration durationOfThis = this instanceof ItalianNoteWithDuration ?
						((ItalianNoteWithDuration) this).getDuration() :
						((EnglishNoteWithDuration) this).getDuration();
				Duration durationOfOther = other instanceof ItalianNoteWithDuration ?
						((ItalianNoteWithDuration) other).getDuration() :
						((EnglishNoteWithDuration) other).getDuration();
				
				return durationOfThis.compareTo(durationOfOther);
			}
		}
	}
}
