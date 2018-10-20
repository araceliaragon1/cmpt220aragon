import java.util.Date;

public class SoccerMatch {
	public Date startTime;
	public Date endTime; 
	public String location;
	public String home;
	public String visitor;
	public Player[] homePlayers = new Player[11];
	public Player[] visitorPlayers = new Player[11];
	public Goal[] homeGoals = new Goal[10]; 
	public Goal[] visitorGoals = new Goal[10];
	public int numberOfHomePlayers = 0;
	public int numberOfVisitorPlayers = 0;
	public int numberOfHomeGoals = 0;
	public int numberOfVisitorGoals = 0;
	
	public SoccerMatch() {
		
	}
	
	public SoccerMatch(Date startTime, String home, String visitor) {
		this.startTime = startTime;
		this.home = home;
		this.visitor = visitor;
		
	}
	
	public void addHomePlayer(Player p) {
		homePlayers[numberOfHomePlayers] = p;
		numberOfHomePlayers++;
	}
	
	public void addVisitorPlayer(Player p) {
		visitorPlayers[numberOfVisitorPlayers] = p;
		numberOfVisitorPlayers++;
	}
	
	public String getWinner() {
		if (numberOfHomeGoals > numberOfVisitorGoals) {
			return home;
		}else if (numberOfHomeGoals < numberOfVisitorGoals) {
			return visitor;
		}else 
			return "tie";
	}
	
	public void addHomeGoal(Goal g) {
		homeGoals[numberOfHomeGoals] = g;
		numberOfHomeGoals++;
	}
	
	public void addVisitorGoal(Goal g) {
		visitorGoals[numberOfVisitorGoals] = g;
		numberOfVisitorGoals++;
	}
	
}
