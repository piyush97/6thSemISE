public class BoardGames extends DecoratorIndoor {
	DecathlonPOS dp;
	BoardGames(DecathlonPOS dp,String game){
		super(game);
		this.dp = dp;
	}
	public String getCurrentStock() {
		return dp.getCurrentStock() + " BoardGames : "+ this.game+"\n";
	}
}
