import java.util.HashMap;
import java.util.Scanner;

public class NumberThread implements Runnable {
	private HashMap<Integer,String> numberMap = new HashMap<>();

	public NumberThread() {
		numberMap.put(1, "One");
		numberMap.put(2, "Two");
		numberMap.put(3, "Three");
		numberMap.put(4, "Four");
		numberMap.put(5, "Five");
		numberMap.put(6, "Six");
		numberMap.put(7, "Seven");
		numberMap.put(8, "Eight");
		numberMap.put(9, "Nine");
		numberMap.put(0, "Zero");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Enter a 4 digit number: ");
		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		for (int i = 0; i < number.length(); i++){
			int digit = Integer.parseInt("" + number.charAt(i));
			System.out.println(digit + ": " + numberMap.get(digit));
		}
	}

}
