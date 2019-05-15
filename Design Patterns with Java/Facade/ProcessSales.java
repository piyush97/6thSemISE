

import java.util.Scanner;
public class ProcessSales {
	boolean giftCert; int numItems; float billAmount; 
	
	ProcessSales(boolean giftCert, int numItems, float billAmount){ 
		this.giftCert = giftCert; 
        this.numItems = numItems; 
        this.billAmount = billAmount; 
	}
	
	void processSale() {
		float giftCertValue, cashToPay; 
		Scanner scan; 
		if(!giftCert) {
			System.out.println("You dont have a Gift Certificate");
		    System.out.println("Therefore pay Rs."+billAmount); 
		}
		
		else { 
			System.out.println("Gift Certificate Value? "); 
			scan = new Scanner(System.in); 
			giftCertValue = scan.nextFloat(); 
			
			if(numItems > 1) { 
				System.out.println("You can purchase only ONE item with the Gift Certificate worth Rs." +giftCertValue );
			    System.out.println("You have bought "+ numItems+".Gift Voucher NOT Applicable!"); 
			    System.out.println("Currently pay full Bill Amount Rs."+billAmount); 
			}
			else if(numItems <=0) 
				System.out.println("You have not bought any Items!"); 
			
			else if(giftCertValue < billAmount) {
				cashToPay =  billAmount - giftCertValue; 
				System.out.println("Your Bill Amount is Rs."+billAmount+" Gift Certificate is worth Rs."+giftCertValue); 
				System.out.println("You need to pay Rs."+cashToPay); 
			}
			else if(giftCertValue > billAmount){ 
				System.out.println("You need not pay anything for your Bill Amount of Rs."+billAmount); 
				cashToPay =  giftCertValue - billAmount; 
				System.out.println("Gift certificate value Rs."+giftCertValue+" you are non returnable balance"+cashToPay); 
			}	
			
				
		} 
		
	}
}
