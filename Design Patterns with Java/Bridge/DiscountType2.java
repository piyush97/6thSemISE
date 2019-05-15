package Bridge;

public class DiscountType2 implements iDiscountCalculator {
	
	//This class is another concrete implementation of Bridge Pattern - another discount scheme, Type2
	//It implements the algorithm / logic of "calculateBillAmount" method in "iDiscountCalculator" 
	//This class is concerned about the type of discount to be applied. In this case 20% discount on MRP and Rs.250 off for all purchases above Rs.6000. 

	public void calculateBillAmount(double mrptotal) {
		double billamount; double discount; int offamount = 0; 
		
		discount = 0.20; //20% discount on MRP
		    
		    //Give Rs.250 off for all purchases above Rs.6000. 
			if(mrptotal > 6000) offamount = 250; 
			billamount = mrptotal - discount * mrptotal - offamount;
			
			System.out.println("\nYour MRP Amount is "+ mrptotal);
			System.out.println("Store Level Flat Discount for the day Rs." + offamount+ " is applied for you"); 
			System.out.println("After discount, Your Bill Amount is "+ billamount);
	}
	
}
