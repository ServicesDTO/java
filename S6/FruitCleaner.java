package S6;

abstract class FruitCleaner {
    
    // Принцип единственной ответственности (Single Responsibility Principle) класс отвечает конкретно за одно действие.
    public static void cleanFruit(Fruit fruit){

        if (Fruit.NEEDTOBECLEAN){
            System.out.println("Чтобы снять кожуру берем нож.");
        }
        else {
            System.out.println("Можно снять кожуру руками.");
        }
        
        
    
}
}
