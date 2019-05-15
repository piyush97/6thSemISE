

public class Client {

	public static void main(String[] args) {
		
		float billAmount = (float) 10240.50;  
		Facade fc = new Facade(true, billAmount); 
		
		fc.calculateAmountToPay();
		fc.displayItemsPurchased(); 
		
		
	}

}
