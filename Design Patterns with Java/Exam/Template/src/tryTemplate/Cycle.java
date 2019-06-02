package tryTemplate;

import java.util.ArrayList;

public class Cycle implements Menu {
	ArrayList<Item> al=new ArrayList<Item>();

	public Cycle() {
		// TODO Auto-generated constructor stub
		al.add(new Item(1, "cycle1", 1000));
		al.add(new Item(2, "cycle2", 2000));
		al.add(new Item(3, "cycle3", 3000));
		al.add(new Item(4, "cycle4", 4000));
		al.add(new Item(5, "cycle5", 5000));

	}

	@Override
	public void displayMenu() {
		// TODO Auto-generated method stub
		System.out.println("List of Items:-");
		for(Item i:al) {
			System.out.println("\nID: "+i.id+"\nName: "+i.name+"\nPrice: "+i.price);
		}

	}

}
