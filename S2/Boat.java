package Java_OOP.S2;

public class Boat extends Vehicle implements Swimable {

    public Boat(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    private int maxSpeed;
    private boolean isSailing = false;

    public void startEngine() {
        if (isSailing == false) {
            System.out.println("Двигатель запущен!");
        }
        engineON = true;
    }

    public void stopEngine() {
        if (engineON == false && isSailing == false) {
            System.out.println("Двигатель остановлен!");
            maxSpeed = 0;
        }
    }

    @Override
    public void startSwimming() {
        if (engineON == true) {
            System.out.println("Начинаем навигацию!");
            isSailing = true;
        } else {
            System.out.println("Проверьте двигатель.");
            isSailing = false;
        }
    }

    @Override
    public void stopSwimming() {
        isSailing = false;
        engineON = false;

        System.out.println("Прибыли в место назначение!");
        // TODO Auto-generated method stub

    }

    @Override
    void displayInfo() {
        if (isSailing) {
            System.out.println("Судно в пути! ");
        } else {
            System.out.println("Судно на пришвартовано!");
        }
    }
}

/*
 * Класс Boat (лодки):
 * 
 * Наследует от Vehicle.
 * Реализует методы абстрактного класса displayInfo.
 * Реализует методы интерфейса Swimmable.
 * Добавляет свойства: int maxSpeed (максимальная скорость на воде), boolean
 * isSailing (флаг состояния движения по воде).
 * Реализует методы:
 * void startEngine() - запуск двигателя лодки.
 * void stopEngine() - остановка двигателя лодки.
 * void startSwimming() - начало движения лодки по воде.
 * void stopSwimming() - прекращение движения лодки по воде.
 * Главный класс Main для проверки:
 */
