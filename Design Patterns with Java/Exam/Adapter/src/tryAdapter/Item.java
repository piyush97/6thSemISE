package tryAdapter;

public class Item {
	
	String name;
	int qty;
	float price;
	CalcTax ct;
	
	public Item(String name,int qty,float price,CalcTax ct) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.price=price;
		this.qty=qty;
		this.ct=ct;
	}
	
	void setTax(CalcTax ct) {
		this.ct=ct;
	}
	
	void setQuantity(int qty) {
		this.qty=qty;
	}

	void displayItem() {
		System.out.println("\nName: "+name);
		System.out.println("Quantity: "+qty);
		System.out.println("Price: "+price);
		float tax=ct.taxAmount(qty, price);
		float billAmount=(qty*price)+tax;
		System.out.println("Tax Amount: "+tax);
		System.out.println("Bill Amount: "+billAmount);		
	}
}
