public class FTCSales extends Sales {
    @Override
    Customer getCustomer() {
        return new FTCustomer();
    }
}
