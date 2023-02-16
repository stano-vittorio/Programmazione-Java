package it.univr.soccer;

public class Formation {
	
	private final SoccerPlayer[] players;
	  
	public Formation(SoccerPlayer[] players) {
		this.players = players;
		
		if (!isValid()) {
			throw new IllegalArgumentException("invalid formation");
		}
	}

	protected boolean isValid() {
	    // ritorna true se e solo se la formazione è fatta da 11 giocatori,
		// di cui esattamente uno è un portiere
		return players.length == 11 && countGoalKeepers() == 1;
	}
	
	private int countGoalKeepers() {
		int counter = 0;
		
		for(SoccerPlayer player: players) {
			
			if(player instanceof GoalKeeper) {
				counter++;
			}
		}
		return counter;
	}

	protected SoccerPlayer[] getPlayers() {
		// ritorna i giocatori di questa formazione
		return players;
	}

	public final String toString() {
		// ritorna i nomi dei giocatori della formazione, separati da virgola
		String result = "";
		
		for(SoccerPlayer player: players) {
			
			if(result.isEmpty()) {
				result = player.toString();
			} else {
				result += ", " + player.toString();
			}
		}
		return result;
	}
}