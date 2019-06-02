import java.util.Scanner;

public class OfflineOrder extends OrderProcessing {

	Cycle menu;
	public OfflineOrder() {
		// TODO Auto-generated constructor stub
		menu=new Cycle();
	}

	@Override
	Item selectItem() {
		// TODO Auto-generated method stub
		//menu.displayMenu();
		for(Item i:menu.al) {
			System.out.println("\nID: "+i.id+"\nName: "+i.name+"\nPrice: "+i.price);
			System.out.println("Do you wish to select this product?(y/n): ");
			Scanner in=new Scanner(System.in);
			String c=in.nextLine();
			if(c.equals("y")) {
				return i;
			}
			
		}
		
		
		//Item i=null;
	/*	for(Item l:menu.al) {
			if(l.getID()==c) {
				return l;
			}
				
		}
	*/
		System.out.println("No More Items to show!");
		return null;
	}

	@Override
	void doPayment(Item i) {
		// TODO Auto-generated method stub
		System.out.println("\nSelected Item:-");
		System.out.println("ID: "+i.id);
		System.out.println("Name: "+i.name);
		System.out.println("Price: "+i.price);
		System.out.println("\nPayment Modes:-\n1.Cash\n2.Card");
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
			cash();
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

	private void cash() {
		// TODO Auto-generated method stub
		System.out.println("Thanks for the Cash Payment!");		
	}

	@Override
	void doDelivery() {
		// TODO Auto-generated method stub
		System.out.println("Your product will be delivered at your Address!");

	}

}
