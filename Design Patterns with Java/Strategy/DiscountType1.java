class DiscountType1 implements iDiscountCalculator {

	double billamount; double discount; 
	
	DiscountType1(){
	discount = 0.22; 
	}
	
	public void calculateBillAmount(double mrptotal) {
			
			billamount = mrptotal - discount * mrptotal;
			System.out.println("\nYour MRP Amount is "+ mrptotal);
			System.out.println("After discount, Your Bill Amount is "+ billamount);
	}
	
	
}
