
public class TaxAdapterDemo {
	public static void main(String[] args) {
		SwedenTax st = new SwedenTax();
		Item i1 = new Item("Btwin Roackroder 340", 13999.0, st);
		i1.setQunatity(3);
		i1.printPrice();
		i1.setTax(new MyMauritiusTax());
		i1.printPrice();
			}

}
