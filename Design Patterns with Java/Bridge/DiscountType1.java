package Bridge;

//This class is one of the concrete implementation of Strategy Pattern, a discount scheme Type1
//It implements the algorithm / logic of "calculateBillAmount" method in "iDiscountCalculator" 
//This class is concerned about the type of discount to be applied. In this case 22% discount on MRP. 


public class DiscountType1 implements iDiscountCalculator {

	public void calculateBillAmount(double mrptotal) {
		double billamount; double discount; 
		
		discount = 0.22; //The discount rate to be applied for DiscountType1 
			
			billamount = mrptotal - discount * mrptotal;
			System.out.println("\nYour MRP Amount is "+ mrptotal);
			System.out.println("After discount, Your Bill Amount is "+ billamount);
	}
	
	
}
