public class Bank implements Comparable<Bank> {

    String title, author, publisher;
    Double price;

    Bank(String t, String aut, String pub, Double pr) {
        title = t;
        author = aut;
        publisher = pub;
        price = pr;
    }

    Double getPrice() {
        return price;
    }

    public String toString() {
        return "Book Details : Title " + title + "\n Author " + author + "\n" + " Publisher " + publisher + "\n"
                + "price " + price;
    }

    public int compareTo(Bank o) {
        return getPrice().compareTo(o.getPrice());
    }
}
