public interface SportsCategoryFactory {
	OutdoorAdventureSports getOutdoorAdventureSports(String name);
	OutdoorRegularGames getOutdoorRegularGames();
	IndoorRegularGames getIndoorRegularGames();
}
