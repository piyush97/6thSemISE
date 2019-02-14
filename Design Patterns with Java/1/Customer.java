public abstract class Customer {
  String name;
  String cId;
  Discount discount;

  Customer(String name, String cId) {
    this.cId = cId;
    this.name = name;
  }

  abstract void printType();
  void setDiscount(Discount discount) {
    this.discount = discount;
  }

  void printBill(float amount) {
    float discountAmount = discount.calcDiscount(amount);
  }
}
