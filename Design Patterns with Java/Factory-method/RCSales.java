public class RCSales extends Sales{
    @Override
    Customer getCustomer() {
        return new RegularCustomer();
    }
}
