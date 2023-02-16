package it.univr.calendar;

import java.util.Iterator;

public class Calendar implements Iterable<Calendar.Date> {
	private final int year; // l'anno del calendario

	public Calendar(int year) {
		// costruisce il calendario per l'anno indicato
		this.year = year;
	}

	public boolean isLeapYear() {
		// determina se il calendario è per un anno bisestile
		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
	}

	public Date getStart() {
		// restituisce la prima data del calendario (primo gennaio)
		return new Date(0);
	}

	public Date getEnd() {
		// restituisce l'ultima data del calendario (31 dicembre)
		return new Date(isLeapYear() ? 365 : 364);
	}

	public Iterator<Date> iterator() {
		return new Iterator<Date>() {
	
			private int next = 0;
	
			public boolean hasNext() {
				return next <= (isLeapYear() ? 365 : 364);
			}
	
			public Date next() {
				return new Date(next++);
			}
		};
	}

	private final static int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	private int getDaysInMonth(int month) { // 1 <= month <= 12
		if (month == 2)
			return isLeapYear() ? 29 : 28;
		else
			return daysInMonth[month - 1];
	}

	// classe interna
	public class Date {
		// 0 = primo gennaio, 364 = 31 dicembre (per i bisestili: 365 = 31 dicembre)
		private final int daysFromStart;

		private Date(int daysFromStart) {
			this.daysFromStart = daysFromStart;
		}

		// ritorna il giorno di questa data, tra 1 e 31
		public int getDay() {
			int dfs = daysFromStart;
			int month = 1; // gennaio
			while (dfs >= getDaysInMonth(month))
				dfs -= getDaysInMonth(month++);
			
			return dfs + 1;
		}

		// ritorna il mese di questa data tra 1 e 12
		public int getMonth() {
			int dfs = daysFromStart;
			int month = 1; // gennaio
			while (dfs >= getDaysInMonth(month))
				dfs -= getDaysInMonth(month++);
			
			return month;
		}

		// ritorna l'anno di questa data
		public int getYear() {
			return year; // della classe esterna Calendar
		}

		public String toString() {
			return String.format("%d/%d/%d", getDay(), getMonth(), getYear());
		}
	}
}