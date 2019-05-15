
public class MyMauritiusTax implements CalcTax {
	NewMauritiusTax mt = new NewMauritiusTax();
	double tax_amount=0.0;
	@Override
	public double taxAmount(String item, int qty, double price) {
		tax_amount = mt.calcTax(qty, price);
		return tax_amount;
	}

}
