import java.util.ArrayList;

public class ItemList {
    ArrayList<Item> itemList = new ArrayList<>();
    ItemList(){
        addItems();
    }
    void dispItemList(){
       // addItems();
        int i=1;
        for(Item x:itemList) {
            System.out.println(i + ": " + x);
            i++;
        }
    }
    void addItems(){ //item can be a parameter
        itemList.add(new Item("Bat","Cricket",2000.0));
        itemList.add(new Item("Ball","cricket",200.0));
        itemList.add(new Item("Gloves","Cricket",1000.0));
        itemList.add(new Item("Btwin rockrider 340","hybrid",13999.0));
        itemList.add(new Item("Btwin rockrider 540","hybrid",23999.0));
        itemList.add(new Item("Btwin rockrider 640","mountain",43999.0));
//        itemList.add(item);
    }
}
