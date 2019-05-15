package pkgTemplateMethod;

public class TemplateMethodClient {

	public static void main(String[] args) {
		OnlineOrderProcessing oOnline = new OnlineOrderProcessing(); 
		//Here "processOrder" is the Template Method Pattern 
		/* It consists of sub-methods 
		 *  selectItem(); doPayment(); doDelivery();
		 */
		oOnline.processOrder(); 
	}

}
