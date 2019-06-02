public class Athletics extends DecoratorOutdoor{
	DecathlonPOS dp;
	Athletics(DecathlonPOS dp,String game){
		super(game);
		this.dp = dp;
	}
	public String getCurrentStock() {
		return dp.getCurrentStock() + " Athletics : "+ this.game+"\n";
	}
}
