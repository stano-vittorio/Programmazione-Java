
public class Main {

	public static void main(String[] args) {
		
		Date[] dates = new Date[10]; // creo contenitore tipo Date (vuoto)
		dates[0] = new Date(13, 10, 2022);
		dates[1] = new Date(13, 1, 2023);
		dates[2] = new Date(30, 1, 2023);
		dates[3] = new Date(30, 3, 2023);
		dates[4] = new Date(30, 6, 2024);
		dates[5] = new Date(11, 7, 2022);
		dates[6] = new Date(12, 8, 2023);
		dates[7] = new Date(10, 10, 2023);
		dates[8] = new Date(31, 10, 2023);
		dates[9] = new Date(29, 2, 2024);
		
		/*
		for(int pos = 0; pos < dates.length; pos++) {
			System.out.println(dates[pos]); // sottointeso toString
		}
		*/
		
		// oppure con for each (equivalente a for di prima)
		for(Date date: dates) {
			System.out.println(date + " --> " + date.getSeason());
		}
		
		int[] frequencies = new int[4];
		
		for(Date date: dates) {
			frequencies[date.getSeason().ordinal()]++;
		}
		
		for(Season season: Season.values()) { // per ogni stagione
			int frequency = frequencies[season.ordinal()];
			double percent = frequency * 100.0 / 10;
			System.out.println(season + ": " + percent + "%");
		}
		
	}

}
