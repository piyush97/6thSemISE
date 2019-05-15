package Bridge;

public class BridgeClientMain {

	public static void main(String[] args) {
		
    double mrptotal = 8000.50; 
		
        RegCust oRC = new RegCust("Sindhu", 24); 
		SeniorCitizenCust oSCC = new SeniorCitizenCust("Vijay Amrithraj",62); 
		
		//Here, the DiscountType can be varied between customers - meaning the discount type is not tied to a customer
		//setDiscountType method lets the cutomer's discount type to be varied 
		
		DiscountType1 odtype1 = new DiscountType1(); 
		oRC.display(); 		
		DiscountType2 odtype2 = new DiscountType2(); 
		oRC.setDiscountType(odtype2); //Regular Customer is given discount type 2 
		 //oDC.setDiscountType(odtype1); //Regular Customer can be given discount type 1 if uncommented  
		
		oRC.calculateDiscount(mrptotal);	
		
		
		oSCC.display(); 
		oSCC.setDiscountType(odtype1); //Regular Customer is given discount type 2 
		oSCC.calculateDiscount(mrptotal);
		 
	}

}