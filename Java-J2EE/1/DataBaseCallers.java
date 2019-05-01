
import java.util.*;
import java.util.Map.Entry;

public class DataBaseCallers {

    public static HashMap<Long, String> hm;
    public static Scanner sc = new Scanner(System.in);

    static void createEnteries(int n) {
        hm = new HashMap<Long, String>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the phone number and Contact name");
            Long phno = sc.nextLong();
            String name = sc.next();
            hm.put(phno, name);
        }
    }

    public static void ForHoldingData() {
        System.out.println("Enter how many details do you require?");
        int n = sc.nextInt();
        createEnteries(n);
    }

    public static void display() {
        Set<Entry<Long, String>> hashSet = hm.entrySet();
        for (Entry<Long, String> entry : hashSet) {

            System.out.println("Key=" + entry.getKey() + ", Value=" + entry.getValue());
        }
    }
}
