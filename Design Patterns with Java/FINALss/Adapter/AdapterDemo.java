public class AdapterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcTax ct=new GST();
		//System.out.println(ct.taxAmount(1, 100));
		Item i1 = new Item("cycle",2,100,ct);
		i1.displayItem();
		
		i1.setTax(new MauriTaxAdapter());
		i1.displayItem();
	}

}
