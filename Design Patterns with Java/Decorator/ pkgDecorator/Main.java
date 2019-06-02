public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecathlonPOS in_sp = new IndoorSports();
		DecathlonPOS ot_sp = new OutdoorSports();
		in_sp = new GamesOnTable(in_sp,"Billiards");
		in_sp = new BoardGames(in_sp,"Carrom");
		in_sp = new CourtGames(in_sp,"Kabaddi");
		in_sp = new CourtGames(in_sp,"Badminton");
		System.out.println(in_sp.getCurrentStock());
		ot_sp = new AdventureGames(ot_sp,"para-gliding");
		ot_sp = new Athletics(ot_sp,"high-jump");
		ot_sp = new StadiumGames(ot_sp,"cricket");
		System.out.println(ot_sp.getCurrentStock());
	}

}
