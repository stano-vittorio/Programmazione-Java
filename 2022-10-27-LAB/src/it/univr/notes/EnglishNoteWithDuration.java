package it.univr.notes;

public class EnglishNoteWithDuration extends EnglishNote {

	private final Duration duration;
	
	public EnglishNoteWithDuration(int semitone, Duration duration) {
		super(semitone);
		this.duration = duration;
	}
		
	public Duration getDuration() {
		return duration;
	}
	
	public String toString() {
		return super.toString() + " " + duration;
	}
}
