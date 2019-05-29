import java.util.ArrayList;

public class CyclingItemList extends ItemList {

    ArrayList<Item> getItemList() {
        itemList.add(new Item("Btwin rockrider 340","hybrid",13999.0));
        itemList.add(new Item("Btwin rockrider 540","hybrid",23999.0));
        itemList.add(new Item("Btwin rockrider 640","mountain",43999.0));
        return itemList;
    }
}
