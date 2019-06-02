import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ItemPurchased {
	HashMap<String, Integer> hm;
	int type;
	
	public ItemPurchased() {
		// TODO Auto-generated constructor stub
		hm=new HashMap<String, Integer>();
		storePurchase();
	}

	private void storePurchase() {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter number of types of Items: ");
		type=Integer.parseInt(in.nextLine());
		for(int i=1;i<=type;i++) {
			System.out.print("Enter name of Item "+i+": ");
			String name=in.nextLine();
			System.out.print("Enter Quantity of Item "+i+": ");
			int qty=Integer.parseInt(in.nextLine());
			hm.put(name, qty);
		}
		
	}
	
	int getTypeCount() {
		return type;
	}
	
	void showItems() {
		System.out.println("Items Purchased:-");
		Set<Map.Entry<String,Integer>> set=hm.entrySet();
		for(Map.Entry<String,Integer> i:set) {
			System.out.println(i.getKey()+":"+i.getValue());
		}
	}

}
