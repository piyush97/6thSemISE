package Bridge;

//This interface is the core algorithm interface of the STRATEGY PATTERN 
//The method "calculateBillAmount" can have different implementation logic to implement different types of discounts based on the context 
//The selection of which discount to be applied should be separated from the actual implementation of the algorithm 

public interface iDiscountCalculator {
	
	public void calculateBillAmount(double mrptotal); 
	//The algorithm interface method which all concrete classes of Strategy will implement such as "DiscountType1", "DiscountType2" etc. 
		

}
