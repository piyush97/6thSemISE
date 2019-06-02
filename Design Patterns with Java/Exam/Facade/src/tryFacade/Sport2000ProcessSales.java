package tryFacade;

import java.util.Scanner;

public class Sport2000ProcessSales {

	boolean giftCert;
	float amount;
	int qty;
	
	public Sport2000ProcessSales(boolean g,float a,int q) {
		// TODO Auto-generated constructor stub
		giftCert=g;
		amount=a;
		qty=q;
	}
	
	void processSales() {
		if(!giftCert) {
			System.out.println("You don't have a Gift Certificate!");
			System.out.println("Amount Payable: "+amount);
		}
		else {
			Scanner in=new Scanner(System.in);
			System.out.print("Enter Gift Certificate Value: ");
			float certValue=Float.parseFloat(in.nextLine());
			
			if(qty<=0) {
				System.out.println("No Items in Cart!");
			}
			else if(qty>1) {
				System.out.println("Only one Item can be purchased using Gift Certificate");
			}
			else if(amount>certValue) {
				System.out.println("Please pay balance amount in Cash: Rs."+(amount-certValue));
			}
			else if(amount<=certValue) {
				System.out.println("No cashback will be Refunded! Thankyou for your Purchase!");

			}
			
		}
		
	}
	
}
