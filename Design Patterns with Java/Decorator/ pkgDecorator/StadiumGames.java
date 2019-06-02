public class StadiumGames extends DecoratorOutdoor {
	DecathlonPOS dp;
	StadiumGames(DecathlonPOS dp,String game){
		super(game);
		this.dp = dp;
	}
	public String getCurrentStock() {
		return dp.getCurrentStock() + " StadiumGames : "+ this.game+"\n";
	}
}
