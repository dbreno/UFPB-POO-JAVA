package obj;

public class Item extends Objeto {
    protected String itemName;
    
    public Item(String itemName, int x, int y) {
        super(x, y);
        this.itemName = itemName;
    }
    
    public String getItemName() {
        return itemName;
    }
    
    public String toString() {
        return "Item: " + itemName + " at position: " + x + "," + y;
    }
    
    public int getSize() {
        return 1;
    }
}
