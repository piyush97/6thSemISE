public class GST implements CalcTax {

	@Override
	public float taxAmount(int qty, float price) {
		// TODO Auto-generated method stub
		return qty*price*0.18f;
	}

}
