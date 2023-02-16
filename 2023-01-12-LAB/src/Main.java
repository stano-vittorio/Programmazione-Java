import java.util.Comparator;

import it.univr.library.AudioBook;
import it.univr.library.Book;
import it.univr.library.Catalog;
import it.univr.library.CatalogWithStatistics;
import it.univr.library.Genre;
import it.univr.library.PaperBook;

public class Main {

	public static void main(String[] args) {
		Book jj = new PaperBook("The joy of Java", "John Stack", 2018, Genre.COMPUTING, 557);
		Book cr = new AudioBook("Cappuccetto rosso", "Charles Perrault", 1697, Genre.FICTION, 13);
		Book ps = new AudioBook("I promessi sposi", "Alessandro Manzoni", 1840, Genre.FICTION, 1223);
		Book ps2 = new PaperBook("I promessi sposi", "Alessandro Manzoni", 1840, Genre.FICTION, 622);
		Book gl = new PaperBook("Sentieri in Lessinia", "Giovanni Gamba", 2015, Genre.GUIDE, 233);
		Book sv = new PaperBook("Gli Scala di Verona", "Roberta Guidi", 2012, Genre.HISTORY, 380);
		Book sv2 = new PaperBook("Gli Scala di Verona", "Roberta Guidi", 2012, Genre.HISTORY, 380);

		System.out.println("Ordinamento naturale:");
		// TODO: crea e poi stampa un catalogo con statistiche che contiene jj, cr, ps, ps2, gl, sv, sv2, ordinato
		// secondo il compareTo fra i libri
		System.out.println(new CatalogWithStatistics(jj, cr, ps, ps2, gl, sv, sv2));
		

		System.out.println("Ordinamento per autore:");
		// TODO: crea e poi stampa un catalogo che contiene jj, cr, ps, ps2, gl, sv, sv2, ordinato
		// per autore e, a parita' di autore, secondo il compareTo fra i libri
		class ComparatorByName implements Comparator<Book> {

			@Override
			public int compare(Book book1, Book book2) {
				
				int diff = book1.getAuthor().compareTo(book2.getAuthor());
				if(diff != 0) {
					return diff;
				} else {
					return book1.compareTo(book2);
				}
			}
		};
		
		Comparator<Book> comparator1 = new ComparatorByName();
		System.out.println(new Catalog(comparator1, jj, cr, ps, ps2, gl, sv, sv2));

		System.out.println("Ordinamento per anno di pubblicazione:");
		// TODO: crea e poi stampa un catalogo che contiene jj, cr, ps, ps2, gl, sv, sv2, ordinato
		// per anno e, a parita' di anno, secondo il compareTo fra i libri
		class ComparatorByYear implements Comparator<Book> {

			@Override
			public int compare(Book book1, Book book2) {
				
				int diff = book1.getYear() - book2.getYear();
				if(diff != 0) {
					return diff;
				} else {
					return book1.compareTo(book2);
				}
			}
		};
		
		Comparator<Book> comparator2 = new ComparatorByYear();
		System.out.println(new Catalog(comparator2, jj, cr, ps, ps2, gl, sv, sv2));

		try {
			new PaperBook("Gli Scala di Verona", "Roberta Guidi", 2012, Genre.HISTORY, -380);
			System.out.println("legale");
		}
		catch (IllegalArgumentException e) {
			System.out.println("illegale");
		}

		try {
			new PaperBook("Gli Scala di Verona", null, 2012, Genre.HISTORY, 380);
			System.out.println("legale");
		}
		catch (IllegalArgumentException e) {
			System.out.println("illegale");
		}
	}
}
