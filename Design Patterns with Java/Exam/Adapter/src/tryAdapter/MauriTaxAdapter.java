package tryAdapter;

public class MauriTaxAdapter implements CalcTax {

	MauriTax mt=new MauriTax();
	@Override
	public float taxAmount(int qty, float price) {
		// TODO Auto-generated method stub
		return mt.mauriTaxAmount(qty, price);
	}

}
