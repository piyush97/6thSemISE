abstract class DecathlonCustomer {
	
	static String name; 
	static int age;
	
	iDiscountCalculator iCC; 
	
	DecathlonCustomer(){}
	
	
	public void calculateDiscount(double mrptotal) { 
		iCC.calculateBillAmount(mrptotal); 
	}
	
	public void display() { 
		System.out.println("Name is "+ name + " \nAge is " + age); 
	}

}

