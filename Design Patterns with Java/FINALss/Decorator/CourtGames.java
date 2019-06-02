public class CourtGames extends DecoratorIndoor {
	DecathlonPOS dp;
	CourtGames(DecathlonPOS dp,String game){
		super(game);
		this.dp = dp;
	}
	public String getCurrentStock() {
		return dp.getCurrentStock() + " CourtGames : "+ this.game+"\n";
	}
}
