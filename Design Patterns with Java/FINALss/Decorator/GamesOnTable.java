public class GamesOnTable extends DecoratorIndoor{
	DecathlonPOS dp;
	GamesOnTable(DecathlonPOS dp,String game){
		super(game);
		this.dp = dp;
	}
	public String getCurrentStock() {
		return dp.getCurrentStock() + " GamesOnTable : "+ this.game+"\n";
	}
}
