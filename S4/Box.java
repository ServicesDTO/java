package Java_OOP.S4;

import java.util.ArrayList;
import java.util.List;

class Box<T> {
    private T item;

    List<T> box = new ArrayList<>();

    
    

    public void put(T item) {
        box.add(item);
    }

    public List<T> get() {
        return box;
    }
}