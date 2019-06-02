public abstract class Customer {

	String id,name,typeOfCust;
	Discount d;
	
	public Customer(String id,String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	
	void printBill(float amt) {
		System.out.println("\nID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Type of Customer: "+typeOfCust);
		System.out.println("Gross Amount: "+amt);
		System.out.println("Discount: "+d.calcDiscount(amt));
		if(amt>=2000) {
			System.out.println("Amount Payable after additional discount: "+(amt-d.calcDiscount(amt)-100));
		}
		else
		{
			System.out.println("Amount Payable: "+(amt-d.calcDiscount(amt)));
		}
	}
	
}
