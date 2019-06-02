package tryTemplate;

import java.util.Scanner;

public class OnlineOrder extends OrderProcessing {

	Cycle menu;
	public OnlineOrder() {
		// TODO Auto-generated constructor stub
		menu=new Cycle();
	}

	@Override
	Item selectItem() {
		// TODO Auto-generated method stub
		menu.displayMenu();
		System.out.println("Enter ID of Product: ");
		Scanner in=new Scanner(System.in);
		int c=Integer.parseInt(in.nextLine());
		//Item i=null;
		for(Item l:menu.al) {
			if(l.getID()==c) {
				return l;
			}
				
		}
		System.out.println("Item not Found!");
		return null;
	}

	@Override
	void doPayment(Item i) {
		// TODO Auto-generated method stub
		System.out.println("\nSelected Item:-");
		System.out.println("ID: "+i.id);
		System.out.println("Name: "+i.name);
		System.out.println("Price: "+i.price);
		System.out.println("\nPayment Modes:-\n1.Paytm\n2.Card");
		//System.out.print("Enter Your Choice: ");
		//Scanner in=new Scanner(System.in);
		//int c=Integer.parseInt(in.nextLine());
		int c;
		do {
			System.out.print("Enter Your Choice: ");
			Scanner in=new Scanner(System.in);
			c=Integer.parseInt(in.nextLine());
			
		switch(c) {
		case 1:
			paytm();
			break;
		case 2:
			card();
			break;
		default:
			System.out.println("Invalid Payment Option!Try Again!");
		}
	}while(c!=1 && c!=2);
		
		

	}

	private void card() {
		// TODO Auto-generated method stub
		System.out.println("Thanks for the Card Payment!");
		
	}

	private void paytm() {
		// TODO Auto-generated method stub
		System.out.println("Thanks for the Paytm Payment!");		
	}

	@Override
	void doDelivery() {
		// TODO Auto-generated method stub
		System.out.println("Your product will be delivered at your Address!");

	}

}
