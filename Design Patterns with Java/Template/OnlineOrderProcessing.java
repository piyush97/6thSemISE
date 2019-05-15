package pkgTemplateMethod;

//This class implements the sub-methods or hidden methods of the 'Template Method - 'processOrder()' 
//The hidden / sub-methods are 'selectItem', 'doPayment' and 'doDelivery'

public class OnlineOrderProcessing extends OrderProcessing{ 
	String answer; //To enable adding more items to this list
	int qty; 
	
	OnlineOrderProcessing() { 
		oItemsList = new ItemsList(); 
		System.out.println("Do you want to add more items to this list?"); 
		answer = scan.next(); //System.out.println("User response is "+ response); 
		if(answer.equals("YES") || answer.equals("yes")  || answer.equals("Yes") || answer.equals("y")  || answer.equals( "Y")) 
			oItemsList.addItems(); //Calls the 'addItems' method of 'ItemList' class 
		  
		
	}//end construtor OnlineOrderProcessing 
	
	//This method is the hidden / sub-method of 'processOrder' TemplateMethod 
	protected void selectItem(){
		System.out.println("The Items available Online for purchase in Decathlon Store are: "); 
		oItemsList.getItemDetails();//Calls the 'getItemDetails' method of 'ItemList' class 
				
	} //end of selectItem method 
	
	//This method is the hidden / sub-method of 'processOrder' TemplateMethod 
	protected void doPayment(String item){
		System.out.println("How many pieces of "+answer+" do you want to buy?"); 
		qty = scan.nextInt(); 
		System.out.println("You need to pay Rs."+oItemsList.calculatePrice(qty,item)); 
		System.out.println("Online Customer****Please Pay through net banking"); 
	}//end doPayment
	
	//This method is the hidden / sub-method of 'processOrder' TemplateMethod 
	protected void doDelivery(){
		System.out.println("If you enter your address for delivery, it will be couriered to that address!"); 
	} //end doDelivery
	
}//end class OnlineOrderProcessing

