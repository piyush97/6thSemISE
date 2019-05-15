
import java.util.*;

public class ItemsPurchased {
	HashMap<String, Integer> Items; 
	Scanner scan; 
	int itemTypes; 
	String iname; Integer iqty; 
	
	
	  ItemsPurchased(){ 
		  Items = new HashMap<String, Integer>();  
		  scan = new Scanner(System.in); 
		  storeItemsPurchaseDetails(); 
	  }
	  
	  int getNumItemTypes() { 
		  return itemTypes; 
		  } 
	  
	  void getItemsPurchased() { 
		  
		  System.out.println("Items you purchased are : "); 
		  System.out.println(Arrays.asList(Items));
			}
	  
	  void storeItemsPurchaseDetails() { 
		  
		  System.out.println("How many item types have you bought?"); 	
		  itemTypes = scan.nextInt();
			
			for(int i =0; i<itemTypes; i++) { 
				System.out.println("Enter the name of item:"+(i+1)); 
				iname = scan.next(); 
				System.out.println("item"+(i+1)+" How many did you buy?"); 
				iqty = scan.nextInt(); 
				Items.put(iname, iqty);	
			}  		
			
	  } 
	  
}
