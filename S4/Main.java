package Java_OOP.S4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static Box<Fruit> getFruitBox() {
        Box<Fruit> box = new Box<>();
        
        box.put(new Apple());
        box.put(new Orange());
        return box;
    }

    public static void printBox(Box<? extends Fruit> box) {
        ArrayList<Fruit> fruit = (ArrayList<Fruit>) box.get();
        System.out.println(fruit.toString());
    }

    public static void main(String[] args) {
        Box<Fruit> fruitBox = getFruitBox();
        printBox(fruitBox);
    }
}