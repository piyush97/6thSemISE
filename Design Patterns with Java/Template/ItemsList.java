package pkgTemplateMethod;

import java.util.ArrayList;
import java.util.Scanner;

/* This class is written to simulate a "Catalog" of items available in Decathlon store. 
 * Uses a user-defined class called 'ItemsList' with 'itemName' and 'itemPrice' 
 * The constructor of 'ItemsList' creates a pre-defined list. 
 * Uses java.util.ArrayList to hold the user-defined objects of the class 'ItemsList' 
 * The methods of 'ItemsList' are: 
 * --- "addItems" method lets you add the items to the ArrayList 'onlineAL'
 * --- "getItemDetails" method lets you display the details of the items entered into the ArrayList 'onlineAL'
 * --- "searchItem" method lets you search the details of the items entered into the ArrayList 'onlineAL'. 
 * Only if the search is successful you would want to invoke 'doPayment' and 'doDelivery' 
 * --- "calculatePrice" method lets you calculate the price of the item that exists in the ArrayList 'onlineAL' 
 */

public class ItemsList { 
	
	String itemName; 
	float itemPrice; 
	Scanner scan; 
	ArrayList<ItemsList> onlineAL = new ArrayList<ItemsList>();
	
	String getName() { 
		return itemName; 
	}
	
	float getPrice() { 
		return itemPrice; 
	}
	
	ItemsList(String name, float price ){ 
		itemName = name; 
		itemPrice = price;
	}
	
	ItemsList(){ 
		onlineAL.add(new ItemsList("Treadmill", (float) 39500.75)); 
		onlineAL.add(new ItemsList("Football", (float) 795.25)); 
		onlineAL.add(new ItemsList("Bicycle", (float) 19580.5)); 
		onlineAL.add(new ItemsList("Volleyball", (float) 875.25)); 
		onlineAL.add(new ItemsList("Ski-Equipment", (float) 25355.75)); 
		onlineAL.add(new ItemsList("Cricket-Set", (float) 15355.75)); 
		getItemDetails(); 
	}// end default constructor ItemsList
	
	public String toString() { 
		return  "Item Name: "+ itemName + "\t"+ "Item Price: "+ itemPrice; 
	}
	// This method lets you add the items to the ArrayList 'onlineAL'
	void addItems() { 
		boolean addItem = true; //Boolean variable to decide if new items need to be added or not 
		int i = 0; 
		scan = new Scanner(System.in) ;
		System.out.println("Enter the Items available for Online Decathlon Store with the price for each"); 
		String response; 
		
		// This while loop lets you add items to the existing list based on user-response 
	
		while(addItem) {
			System.out.println("Enter the name of item# "+(i+1));  
			itemName = scan.next(); 
			System.out.println("Enter the price of item# "+(i+1));  
			itemPrice = scan.nextFloat(); 
			System.out.println("Do you want to add another item?"); 
			response = scan.next(); //System.out.println("User response is "+ response); 
			
			//Creates an unnamed object of ItemsList and adds it to the ArrayList 
			onlineAL.add(new ItemsList(itemName,itemPrice)); 
			
			if(response.equals("YES") || response.equals("yes")  || response.equals("Yes") || response.equals("y")  || response.equals( "Y")) { 
				addItem = true; //System.out.println("addItem is "+ addItem); 
				i++; 
			}//end if 
			else { 
				addItem = false; //System.out.println("addItem is "+ addItem);
			}//end else 
		}//end while 
	}//end setItemDetails
	
	//This method lets you display the details of the items entered into the ArrayList 'onlineAL'
	void getItemDetails(){ 
		
		for(ItemsList i : onlineAL) { 
		System.out.println(i); 
	    }//end for 
		System.out.println("**************************"); 
	}//end getItemDetails
	
	//This method lets you search the details of the items entered into the ArrayList 'onlineAL'
	boolean searchItem(String item) { 
		String str; boolean exists = false;  
		for(int j=0; j<onlineAL.size(); j++) { 
			str = onlineAL.get(j).getName(); 
		if(str.equals(item)) { 
			exists = true; System.out.println(str+" present "+exists); break; 
			
		}//end if 
		else { 
			exists = false;
			//System.out.println(str+exists); 
		}//end else 
		}//end for 
		return exists; 
	}//end searchItem method 
	
	//This method lets you calculate the price of the item that exists in the ArrayList 'onlineAL'
	float calculatePrice(int qty,String item) {
		float price = 0; String str;
		for(int j=0; j<onlineAL.size(); j++) { 
			str = onlineAL.get(j).getName(); 
			if(str.equals(item)) {
			price = onlineAL.get(j).getPrice(); break; 
			}
		}//end for 
			return price*qty; 
		
	}//end calculatePrice method
	
}//end class ItemsList
