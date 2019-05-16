public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberThread thread1 = new NumberThread();
		VowelsThread thread2 = new VowelsThread();
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
	}

}
