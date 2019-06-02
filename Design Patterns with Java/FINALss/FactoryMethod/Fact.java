public class Fact extends FactoryM{
Customer factMethod(String str) {
	if(str.equalsIgnoreCase("First Time")) {
		return new FTCust();
	}
	else if(str.equalsIgnoreCase("Senior")) {
		return new SCust();
	}
	else if(str.equalsIgnoreCase("Regular")) {
		return new RCust();
	}
	return null;
}

}
