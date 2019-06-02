package tryFacade;

public class FacadeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sports2000Facade f=new Sports2000Facade(false, 100);
		f.displayItems();
		f.dispAmount();

	}

}
