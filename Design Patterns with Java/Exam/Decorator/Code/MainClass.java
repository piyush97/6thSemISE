
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Assuming stock of each sport is 2
		
		Sports sp1=new IndoorSports();
		System.out.println("Total Indoor Sports Stock:"+sp1.getCurrentStock());
		sp1=new Billiards(sp1);
		System.out.println("Total Indoor Sports Stock:"+sp1.getCurrentStock());
		sp1=new Carrom(sp1);
		System.out.println("Total Indoor Sports Stock:"+sp1.getCurrentStock());
		sp1=new Badminton(sp1);
		System.out.println("Total Indoor Sports Stock:"+sp1.getCurrentStock());
		
		Sports sp2=new OutdoorSports();
		System.out.println("\nTotal Outdoor Sports Stock:"+sp2.getCurrentStock());
		sp2=new Trekking(sp2);
		System.out.println("Total Outdoor Sports Stock:"+sp2.getCurrentStock());
		sp2=new Cricket(sp2);
		System.out.println("Total Outdoor Sports Stock:"+sp2.getCurrentStock());
		sp2=new HighJump(sp2);
		System.out.println("Total Outdoor Sports Stock:"+sp2.getCurrentStock());
		sp2=new LongJump(sp2);
		System.out.println("Total Outdoor Sports Stock:"+sp2.getCurrentStock());
	}

}
