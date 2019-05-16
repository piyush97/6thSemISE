import java.util.ArrayList;
import java.util.Scanner;

public class VowelsThread implements Runnable {
	private ArrayList<Character> vowels = new ArrayList<>();
	
	public VowelsThread() {
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Enter a word: ");
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		word = word.toLowerCase();

		int v = 0,c = 0;
		for(int i = 0;i < word.length();i++){
			char ch = word.charAt(i);
			if(vowels.contains(ch))
				v++;
			else
				c++;
		}
		System.out.println("Vowels: "+v);
		System.out.println("Consonants: "+c);
	}

}
