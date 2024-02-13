package S6;


public class Main {
    public static void main(String[] args) {
        char a ='\u0000';
        System.out.println(a);
    }

/*
import java.util.ArrayList;
import java.util.List;



/*  1.Single responsibility
    К примеру создаем  класc(FruitCleaner), который будет будет отвечать за чистку фруктов и только.
 *  2.Open-Closed
 *  Делаем класс Fruit абстрактным и описываем основные свойства, которые должны быть реализованы потомками.
 *  3. Метов постанов Барбары Лисков уже реализован, мы можем созать коллекции типа Fruit и помещать туда объекты которые наследуются от Fruit
 *  4. Разделения интерфейса 
 *    Создаем интерфейсы описывающие поведене классов к примеру, срок хранения и время высушивания. 
 *  5. Принцип инверсии зависимостей
 *     Создаем к примеру интерфейс Eatable, в котором описываем 2 метода, пригодный или не пригодный для еды. 
 *     Далее так же можно создать коллекцию с типом Eatable и отделить съедобные фрукты от не сьедобных.  
 *  * 






public class Main {
    public static Box<Fruit> getFruitBox() {
        
         //Уже реализован Принцип подстановки Барбары Лисков (Liskov’s Substitution Principle)
        Box<Fruit> box = new Box<>();
        box.put(new Apple("green",true,6));
        box.put(new Orange("orange",true,5));
        box.put(new Banana("yellow",true,3));
        return box;
    }

    public static void printBox(Box<? extends Fruit> box) {
        ArrayList<Fruit> fruit = (ArrayList<Fruit>) box.get();
        System.out.println(fruit.toString());
        ArrayList<Eatable> eatableFruit = new ArrayList<>();

        for (int i=0;i < fruit.size();i++){
            System.out.println(fruit.get(i).getColour());
            FruitCleaner.cleanFruit(fruit.get(i))
            ;
           
            if (fruit.get(i).ableToEat()){
                eatableFruit.add(fruit.get(i));
            }
        }

        
       
    } 

    

    public static void main(String[] args) {
        Box<Fruit> fruitBox = getFruitBox();
        printBox(fruitBox);

        
    }

   */
  
}