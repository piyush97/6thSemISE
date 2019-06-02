package tryFactoryMethod;

public class CustomerFactory {

	Customer getCustomer(String type) {
		if(type.equalsIgnoreCase("first time"))
			return new FTCustomer();
		else if(type.equalsIgnoreCase("regular"))
			return new RegCustomer();
		else if(type.equalsIgnoreCase("senior citizen"))
			return new SCCustomer();
		else
			return null;
	}
}
