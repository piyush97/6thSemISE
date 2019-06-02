public abstract class Customer {

	String name;
	int age;
	Discount d;
	String typeOfCust;
	
	public Customer(String name,int age,Discount d) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
		this.d=d;
	}
	
	void setDiscount(Discount d) {
		this.d=d;
	}
	
	void showBill(float amt) {
		System.out.println("\nName: "+name);
		System.out.println("Age: "+age);
		System.out.println("Type of Customer: "+typeOfCust);
		System.out.println("Gross Cost: "+amt);
		System.out.println("Discount: "+d.getDiscount(amt));
		System.out.println("Payable Amount: "+(amt-d.getDiscount(amt)));
	}
	
}
