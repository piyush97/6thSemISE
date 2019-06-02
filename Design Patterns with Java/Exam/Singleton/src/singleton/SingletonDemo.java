package singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TabWindow s1=TabWindow.getInstance();
		//System.out.println(s1);
		TabWindow s2=TabWindow.getInstance();
		//System.out.println(s2);
		s1.addUrl("www.google.com");
		s2.addUrl("www.facebook.com");
		TabWindow s3=TabWindow.getInstance();
		s3.showUrls();
	}

}
