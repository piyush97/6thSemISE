public class RegularSportsFactory implements SportsCategoryFactory {

	@Override
	public OutdoorAdventureSports getOutdoorAdventureSports(String name) {
		// TODO Auto-generated method stub
		if(name.equalsIgnoreCase("Bungee Jumping"))
			return new BungeeJumpingRegular();
		else if(name.equalsIgnoreCase("Paragliding"))
			return new ParaglidingRegular();
		else if(name.equalsIgnoreCase("Trekking"))
			return new TrekkingRegular();
		else
			return null;
	}

	@Override
	public OutdoorRegularGames getOutdoorRegularGames() {
		// TODO Auto-generated method stub
		return new CricketRegular();
	}

	@Override
	public IndoorRegularGames getIndoorRegularGames() {
		// TODO Auto-generated method stub
		return new TableTennisRegular();
	}

}
