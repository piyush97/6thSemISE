import java.util.*;

public class BankCollection {

    public static void main(String[] args) {
        ArrayList<Bank> al = new ArrayList<Bank>();
        al.add(new Bank("ced", "wer", "lmn", 12345.00));
        al.add(new Bank("qqq", "aaa", "mmm", 22222.10));
        al.add(new Bank("abc", "xyz", "pqr", 123.566));
        ArrayList<Bank> al1 = new ArrayList<Bank>(al);
        Collections.sort(al1);
        System.out.println("***********Sorted Collection**********");
        for (Bank b : al1) {
            System.out.println(b);
        }
        System.out.println("**********Original Collection**********");
        for (Bank b : al) {
            System.out.println(b);
        }
    }
}
