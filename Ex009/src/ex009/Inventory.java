package ex009;

import java.util.ArrayList;

public class Inventory<T> {
    private ArrayList<T> items;
    
    public Inventory() {
        items = new ArrayList<>();
    }
    
    public boolean hasItem(T item) {
        for (T i: items) {
            if (i.equals(item)) {
                return true;
            }
        }
        return false;
    }
    
    public void addItem(T item) {
        items.add(item);
    }
    
    public void removeItem(T item) {
        items.remove(item);
    }
    
    public void listItems() {
        items.sort(null);
        
        for (T item: items) {
            System.out.println(item.toString());
        }
    }
}
