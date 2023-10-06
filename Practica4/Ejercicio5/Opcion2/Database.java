package Ejercicio5.Opcion2;

import java.util.ArrayList;
import java.util.Iterator;

public class Database {
    private ArrayList items;
    
    public Database() {
        items = new ArrayList();
    }
    
    public void addItem(Item item) {
        items.add(item);
    }

    public void list() {
        for(Item item: items) {
            item.print();
            System.out.println(); // empty line between items
        }   
    }
}
   


