public class POS {
    public static void main(String[] args) {
       Sales mySales = new FTCSales();
       mySales.calcFinal();
       mySales = new RCSales();
       mySales.calcFinal();


    }
}
