class RegCustomer extends DecathlonCustomer {

	RegCustomer() {
		super();
		iCC = new DiscountType1(); 
		
	} 
	
	public void display() { 
		
		System.out.println("\nHello Regular Customer! Welcome Back..."); 
		super.display(); 
	}

}
