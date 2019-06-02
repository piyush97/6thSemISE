package tryObserver;

public class Customer extends Observer {

	Subject store;
	float discount;
	String name;
	public Customer(Subject subject,String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
		store=subject;
		store.register(this);
		
		
	}
	@Override
	void update(float discount) {
		// TODO Auto-generated method stub
		this.discount=discount;
		System.out.println(name+ ",you get a discount of "+discount+"%");
	}
	
	public String toString() {
		return name;
	}

}
