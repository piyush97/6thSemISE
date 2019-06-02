package tryStrategy;

public class FTCCustomer extends Customer {

	public FTCCustomer(String id, String name) {
		super(id, name);
		this.d=new FTCDiscount();
		typeOfCust="First Time Customer";
		// TODO Auto-generated constructor stub
	}

}
