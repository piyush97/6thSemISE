import java.util.Scanner;

public  abstract class Sales {
    ItemList itemList = new ItemList();

    double total=0;
    Customer customer;
    void calcTotal(){

        Scanner sc = new Scanner(System.in);
        char ch='y';
        do{
            itemList.dispItemList();
            System.out.println("Select the item:");
            int i = sc.nextInt();
            --i;
            System.out.println("Selected item price: "+itemList.itemList.get(i).price);
            total+=itemList.itemList.get(i).price;
            System.out.println("Your total now: "+total);

            System.out.println("want to buy other item?(y/n)");
            ch = sc.next().charAt(0);
        }while(ch=='y');
    }
    abstract Customer getCustomer();
    void calcFinal(){
        calcTotal();
        customer = getCustomer();

        System.out.println("Final amount = "+(total-total*customer.discount.discount));
        System.out.println("You got a discount of: Rs."+total*customer.discount.discount);
    }

}
