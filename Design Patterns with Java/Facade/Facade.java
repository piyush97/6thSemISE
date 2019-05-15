


public class Facade {
	
	ItemsPurchased oItempurchased; 
	ProcessSales oProcesssales; 
	
	Facade(boolean giftCert, float billAmount){ 
		oItempurchased = new ItemsPurchased(); 
		int numItems = oItempurchased.getNumItemTypes(); 
		System.out.println("Number of Items Purchased is "+numItems); 
		System.out.println("Gift Certificate exists "+giftCert); 
		oProcesssales = new ProcessSales(giftCert, numItems, billAmount); 
	}
	
	
	void displayItemsPurchased() { 
		oItempurchased.getItemsPurchased(); 
	}
		
	
	void calculateAmountToPay() { 
		oProcesssales.processSale(); 
	}
}
