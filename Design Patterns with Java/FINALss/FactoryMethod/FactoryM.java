public abstract class FactoryM {
	abstract Customer factMethod(String str);
	final void getInstance(String str) {
		try{
			Customer c=factMethod(str);
			c.printType();
			}
		catch(Exception e) {
			System.out.println("Not a valid customer");
		}
	}
}
