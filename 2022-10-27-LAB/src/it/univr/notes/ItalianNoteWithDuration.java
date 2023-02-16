package it.univr.notes;

public class ItalianNoteWithDuration extends ItalianNote {

	private final Duration duration;
		
	public ItalianNoteWithDuration(int semitone, Duration duration) {
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
