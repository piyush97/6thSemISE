package tryAbstractFactory;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Regular Sports
		SportsCategoryFactory reg=new RegularSportsFactory();
		OutdoorAdventureSports sp1=reg.getOutdoorAdventureSports("trekking");
		OutdoorRegularGames sp2=reg.getOutdoorRegularGames();
		IndoorRegularGames sp3=reg.getIndoorRegularGames();
		
		sp1.getSportName();
		sp2.getSportName();
		sp3.getSportName();
		
		//Differently Abled Sports
		SportsCategoryFactory diffabled=new DiffAbledSportsFactory();
		OutdoorAdventureSports dsp1=diffabled.getOutdoorAdventureSports("Paragliding");
		OutdoorRegularGames dsp2=diffabled.getOutdoorRegularGames();
		IndoorRegularGames dsp3=diffabled.getIndoorRegularGames();
		
		dsp1.getSportName();
		dsp2.getSportName();
		dsp3.getSportName();
		
		
	}

}
