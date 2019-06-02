package tryAdapter;

public class AdapterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcTax ct=new MauriTaxAdapter();
		//System.out.println(ct.taxAmount(1, 100));
		Item i1 = new Item("cycle",2,100,ct);
		i1.displayItem();
		
		i1.setTax(new GST());
		i1.displayItem();
	}

}
