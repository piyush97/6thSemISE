import java.util.*;

public class BookCollection {

    public static void main(String[] args) {
        ArrayList<Book> al = new ArrayList<Book>();
        al.add(new Book("ced", "wer", "lmn", 12345.00));
        al.add(new Book("qqq", "aaa", "mmm", 22222.10));
        al.add(new Book("abc", "xyz", "pqr", 123.566));
        ArrayList<Book> al1 = new ArrayList<Book>(al);
        Collections.sort(al1);
        System.out.println("***********Sorted Collection**********");
        for (Book b : al1) {
            System.out.println(b);
        }
        System.out.println("**********Original Collection**********");
        for (Book b : al) {
            System.out.println(b);
        }
    }
}
