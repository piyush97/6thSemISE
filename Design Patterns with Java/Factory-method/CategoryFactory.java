public class CategoryFactory {

	public Customer category(String ptype)
	{
		if(ptype.equalsIgnoreCase("Teen"))
				return new Teens();
		else if(ptype.equalsIgnoreCase("Aged"))
				return new Aged();
		else if(ptype.equalsIgnoreCase("kidds"))
			return new kidds();

		return null;
	}
}
