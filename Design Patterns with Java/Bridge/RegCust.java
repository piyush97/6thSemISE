package Bridge;

//The Abstractions are "Regular Customer" & "Senior Citizen Customer" 
//We could have a new category called "First Time Customer" or "Female Regular Customer", "Male Senior Citizen" etc etc 
//Meaning, the Abstractions are varying 
//The implementations - Discount Type is also varying - DiscountType1, DiscountType2, DiscountType3 etc 
//BRIDGE Patterns allows Abstractions and Implementations to vary independently 
//It helps to eliminate the "Class Explosion" problem 

public class RegCust extends DecathlonCustomer {

	public RegCust(String s, int a) {
		super(s,a); 
	}
	
	public void display() { 
		
		System.out.println("\nHello Regular Customer! Welcome Back..."); 
		super.display(); 
	}

}