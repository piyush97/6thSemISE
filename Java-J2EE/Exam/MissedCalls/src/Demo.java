import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		HashMap<Integer, String> callersList = new HashMap<>();
		System.out.println("Enter the number of people in the callers list"); //Haven't fixed as 10 as per the question
		Scanner s = new Scanner(System.in);
		int n;
		n = s.nextInt();
		System.out.println("Enter the details of the callers in the list");
		for(int i=0; i<n; i++){
			System.out.println("Enter the name, number ");
			String name = s.next();
			int number = s.nextInt();
			callersList.put(number, name);
		}

		ArrayList<Call> missedCalls = new ArrayList<>();

		System.out.println("Enter the missed calls, one after another");
		int ch=0;
		int i=0;
		while(ch!=2){
			System.out.println("1. Insert Call\n2. Exit");
			ch = s.nextInt();
			switch(ch){
			case 1:
				System.out.println("Enter the number, time of the call");
				int num = s.nextInt();
				String t = s.next();
				String name = "Private Caller";
				if(callersList.containsKey(num)){
					name = callersList.get(num);
				}
				Call call =  new Call(name, num, t);
				try{
					missedCalls.set(i, call);
				}catch(Exception e){
					missedCalls.add(call);
				}finally {
					i = (i+1)%10;
				}
				break;
			case 2:
				break;
			}
		}

		System.out.println("List of Missed calls");

		for (Iterator<Call> iterator = missedCalls.iterator(); iterator.hasNext(); ) {
		    Call ca = iterator.next();
		    System.out.println("Number : " + ca.phoneNumber);
			int choice=0;
			System.out.println("1. Delete call\n2. Next Missed Call\n3. Display Call details");
			choice = s.nextInt();
			switch(choice){
			case 1:
				iterator.remove();
				break;
			case 2:
				break;
			case 3:
				ca.display();
				break;
			}
		}

		s.close();
	}
}
