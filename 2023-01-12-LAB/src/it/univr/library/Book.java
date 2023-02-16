package it.univr.library;

/**
 * Un libro.
 */
public abstract class Book implements Comparable<Book> {
	
	private final String title;
	private final String author;
	private final int year;
	private final Genre genre;
	
	/**
	 * Crea un libro.
	 * 
	 * @param title il titolo del libro
	 * @param author l'autore del libro
	 * @param year l'anno di pubblicazione del libro
	 * @param genre il genere del libro
	 * @throws IllegalArgumentException se qualche parametro e' null
	 */
	protected Book(String title, String author, int year, Genre genre) {
		//TODO
		if(title == null) {
			throw new IllegalArgumentException("title non può essere null");
		}
		if(author == null) {
			throw new IllegalArgumentException("author non può essere null");
		}
		if(genre == null) {
			throw new IllegalArgumentException("genre non può essere null");
		}
		
		this.title = title;
		this.author = author;
		this.year = year;
		this.genre = genre;
	}

	/**
	 * Restituisce il titolo del libro.
	 */
	public String getTitle() {
		return title; //TODO
	}

	/**
	 * Restituisce l'autore del libro.
	 */
	public String getAuthor() {
		return author; //TODO
	}

	/**
	 * Restituisce il genere del libro.
	 */
	public Genre getGenre() {
		return genre; //TODO
	}

	/**
	 * Restituisce l'anno di pubblicazione del libro.
	 */
	public int getYear() {
		return year; //TODO
	}

	/**
	 * Ritorna il titolo fra doppi apici seguito dall'autore e poi
	 * (fra parentesi) anno di pubblicazione e genere.
	 */
	@Override
	public String toString() {
		return "\"" + title + "\" by " + author + " (" + year + ", " + genre + ")"; //TODO
	}

	/**
	 * Due libri sono equals se hanno stesso titolo, autore e anno di pubblicazione.
	 * Il genre non viene preso in considerazione.
	 */
	@Override
	public boolean equals(Object other) {
		//TODO
		if(other instanceof Book) {
			Book otherAsBook = (Book)other;
			
			return title.equals(otherAsBook.title) && author.equals(otherAsBook.author) && year == otherAsBook.year;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return title.hashCode() ^ author.hashCode() ^ year; // TODO, non banale
	}

	/**
	 * Due libri sono ordinati per titolo; a parità di titolo, sono ordinati per autore;
	 * a parità anche di autore, sono ordinati per anno di pubblicazione.
	 */
	@Override
	public int compareTo(Book other) {
		//TODO
		int diff = title.compareTo(other.title);
		if(diff != 0) {
			return diff;
		}
		
		diff = author.compareTo(other.author);
		if(diff != 0) {
			return diff;
		}
		
		return year - other.year;
	}
}