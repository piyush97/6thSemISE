package pkgTemplateMethod;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class OrderProcessing {
	Scanner scan = new Scanner(System.in) ; 
	ItemsList oItemsList; 
	//Here "processOrder" is the Template Method Pattern 
			/* It consists of sub-methods 
			 *  selectItem(); doPayment(); doDelivery();
			 */
	//NOTE: Template Methods are always declared as "final" in the parent class. 
	//Reason: They are not suppossed to be over-ridden by the sub-classes 
	public final void processOrder() { 
		
		selectItem(); 
		System.out.println("Which Item do you want to buy?"); 
		String item = scan.next(); 
		boolean exists; 
		exists = oItemsList.searchItem(item); 
		//Search for the item in the ArrayList 'onlineAL'. Only if it exists call the methods 'doPayment()' and  'doDelivery()'
		if(exists){
			doPayment(item); doDelivery(); 
	}
		else
			System.out.println("Sorry! We do not have the item "+item+" which you are looking for!"); 		
		
	}//end processOrder method
	
	//These are the abstract methods that are implemented by the child-classes 'OnlineOrderProcessing' and 'OfflineOrderProcessing' 
	protected abstract void selectItem(); 
	protected abstract void doPayment(String item);
	protected abstract void doDelivery();
}// end class  OrderProcessing


