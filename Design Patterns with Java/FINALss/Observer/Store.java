import java.util.ArrayList;

public class Store extends Subject {

	float discount;
	String name;
	ArrayList<Observer>	ol;
	public Store(String name,float discount) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.discount=discount;
		ol=new ArrayList<Observer>();
	}
	@Override
	void register(Observer o) {
		// TODO Auto-generated method stub
		ol.add(o);
		System.out.println("Added Customer "+o+" to "+name);
	}

	@Override
	void unregister(Observer o) {
		// TODO Auto-generated method stub
		try {
			ol.remove(ol.indexOf(o));	
			System.out.println("Removed Customer "+o+" from "+name);
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("No such Customer called "+o+" in "+name);
		}
		
	}

	@Override
	void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer o:ol)
			o.update(discount);

	}
	
	void setDiscount(String festival,float d) {
		discount=d;
		System.out.println("New Discount Offer on Account of "+festival);
		notifyObservers();
	}

}
