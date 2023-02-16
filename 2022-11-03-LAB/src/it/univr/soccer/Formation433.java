package it.univr.soccer;

public class Formation433 extends Formation {

	public Formation433(SoccerPlayer[] players) {
		super(players);
		// TODO Auto-generated constructor stub
	}
	
	protected boolean isValid() {
		return super.isValid() && countDefences() == 4 && countMidfield() == 3 && countForward() == 3;
	}
	
	private int countForward() {
		int counter = 0;
		
		for(SoccerPlayer player: getPlayers()) {
			
			if(player instanceof Forward) {
				counter++;
			}
		}
		return counter;
	}
	
	private int countMidfield() {
		int counter = 0;
		
		for(SoccerPlayer player: getPlayers()) {
			
			if(player instanceof Midfield) {
				counter++;
			}
		}
		return counter;
	}
	
	private int countDefences() {
		int counter = 0;
		
		for(SoccerPlayer player: getPlayers()) {
			
			if(player instanceof Defence) {
				counter++;
			}
		}
		return counter;
	}
}
