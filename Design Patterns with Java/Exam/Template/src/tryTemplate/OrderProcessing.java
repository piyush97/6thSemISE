package tryTemplate;

public abstract class OrderProcessing {

	abstract Item selectItem();
	abstract void doPayment(Item i);
	abstract void doDelivery();
	
	void purchaseItem() {
		Item i=selectItem();
		if(i!=null) {
			
			doPayment(i);
			doDelivery();
		}
	}
	

}
