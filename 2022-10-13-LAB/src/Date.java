
public class Date {
	
	// campi (fields) degli oggetti di tipo Date (stato)
	// final = finale o non mutabile.
	private final int day;
	private final int month;
	private final int year;
	private Language language; // Language = tipo --> language = variabile
	
	// COSTRUTTORE
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.language = Language.ITALIAN;
		
		if(!legal()) {
			System.out.println("La data " + this + " non esiste");
		}
	}
	
	// riferimento per inizio data SPRING
	public static Date firstOfSpring(int year) {
		return new Date(21, 3, year);
	}
	// riferimento per inizio data SUMMER
	public static Date firstOfSummer(int year) {
		return new Date(21, 6, year);
	}
	// riferimento per inizio data FALL
	public static Date firstOfFall(int year) {
		return new Date(23, 9, year);
	}
	// riferimento per inizio data WINER
	public static Date firstOfWinter(int year) {
		return new Date(21, 12, year);
	}
	
	public Season getSeason() {
		// 21 marzo --> inizio primavera
		// 21 giugno --> inizio estate
		// 23 settembre --> inizio autunno
		// 21 dicembre --> inizio inverno
		
		if(this.compareTo(firstOfSpring(year)) < 0) {
			return Season.WINTER;
		} else if(this.compareTo(firstOfSummer(year)) < 0) {
			return Season.SPRING;
		} else if(this.compareTo(firstOfFall(year)) < 0) {
			return Season.SUMMER;
		} else if(this.compareTo(firstOfWinter(year)) < 0) {
			return Season.FALL;
		} else {
			return Season.WINTER;
		}
	}
	
	// controlla se this e other sono semanticamente uguali
	public boolean equals(Date other) {
		return this.day == other.day && this.month == other.month && this.year == other.year;
	}
	
	/* controlla chi viene prima cronologicamente tra this e other
	 * RITORNA:
	 * negativo se viene prima this
	 * positivo se viene prima other
	 * zero se this e other sono semanticamente uguali
	 */
	public int compareTo(Date other) {
		
		if(this.year < other.year) {
			return -1;
		} else if(this.year > other.year) {
			return 13;
		} else if(this.month < other.month) {
			return -3;
		} else if(this.month > other.month) {
			return 1;
		} else if(this.day < other.day) {
			return -3;
		} else if(this.day > other.day) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public void setLanguage(Language newLanguage) {
		language = newLanguage;
	}
	
	private boolean legal() {
		boolean ok = month >= 1 && month <= 12 &&
					 year >= 1600 && day >= 1 && day <= daysInMonth();
		return ok;
	}
	
	// array allocato solo una volta quando nasce l'oggetto
	private final static int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // è un campo
	// con static array condiviso tra tutti gli oggetti
	
	private int daysInMonth() {
		if(month == 2 && isLeapYear()) {
			return 29;
		}
		return days[month - 1];
	}

	public boolean isLeapYear() {
		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
	}

	public String toString() {
		if(language == Language.ITALIAN) {
			return this.day + "/" + this.month + "/" + this.year;
		} else {
			return this.month + "/" + this.day + "/" + this.year;
		}
	}
}
