package tryStrategy;

public class StrategyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1=new RCCustomer("rc1", "modi");
		c1.printBill(100);
		
		c1=new SCCustomer("sc1", "trump");
		c1.printBill(100);
		
		c1=new FTCCustomer("ftc1", "raga");
		c1.printBill(100);
		
	}

}
