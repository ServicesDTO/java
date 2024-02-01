package S6;

import java.util.ArrayList;
import java.util.List;

class Box<T> {
    private T item;

     List<T> itemList = new ArrayList<>();

    
    

    public void put(T item) {
        itemList.add(item);
    }

    public List<T> get() {
        return itemList;
    }
}