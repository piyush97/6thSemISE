public class StrategyClientMain {

	public static void main(String[] args) {
		
		double mrptotal = 8000.50; 
		RegCustomer oRC = new RegCustomer(); 
		oRC.calculateDiscount(mrptotal);	
		oRC.display();			
		FirstTimeCustomer oFTC = new FirstTimeCustomer(); 
		oFTC.calculateDiscount(mrptotal);	
		oFTC.display(); 
	}

}
