import java.util.ArrayList;

public class CricketItemList extends ItemList {

    ArrayList<Item> getItemList() {
        itemList.add(new Item("Bat","Cricket",2000.0));
        itemList.add(new Item("Ball","cricket",200.0));
        itemList.add(new Item("Gloves","Cricket",1000.0));
        return itemList;
    }
}
