public class Item {
    String name;
    String type;
    double price;
    Item(String name,String type, double price){
        this.type = type;
        this.name = name;
        this.price = price;
    }
    public  String toString(){
        return name+":"+type+":"+price;
    }
}
