package Bridge;

//This is the DOMAIN Class 
//It is the Parent of the inheritance hierarchy consisting of "Regular Customers", "First Time Customers", "Senior Citizen Customers" etc 
//It sets the logic for passing the correct context. In this case, the correct Discount Type object. 

abstract public class DecathlonCustomer {
	
	 String name; 
	 int age;
	
	iDiscountCalculator iCC; 
	public DecathlonCustomer (String s, int a) { name = s; age = a; } 
	DecathlonCustomer(){}
	
	public void setDiscountType (iDiscountCalculator refCC) { 
		iCC = refCC; 
	}
	
	public void calculateDiscount(double mrptotal) { 
		iCC.calculateBillAmount(mrptotal); 
	}
	
	public void display() { 
		System.out.println("Name is "+ name + " \nAge is " + age); 
	}

}
