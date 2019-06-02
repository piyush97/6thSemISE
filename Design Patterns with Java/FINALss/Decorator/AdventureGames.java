public class AdventureGames extends DecoratorOutdoor{
	DecathlonPOS dp;
	AdventureGames(DecathlonPOS dp,String game){
		super(game);
		this.dp = dp;
	}
	public String getCurrentStock() {
		return dp.getCurrentStock() + " AdventureGames: "+ this.game+"\n";
	}
}
