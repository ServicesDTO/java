package Java_OOP.S2;

public class Aircraft extends Vehicle implements Flyable {

    public Aircraft(int maxAltitude, boolean isFlying) {
        this.maxAltitude = maxAltitude;
        this.isFlying = isFlying;
    }

    int maxAltitude;
    boolean isFlying = false;
    int maxSpeed;
    boolean chassis = true;

    public int getMaxAltitude() {
        return maxAltitude;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void startEngine() {
        if (isFlying == false) {
            System.out.println("Двигатель запущен!");
        }
        engineON = true;
    }

    public void stopEngine() {
        if (engineON == false && isFlying == false) {
            System.out.println("Двигатель остановлен!");
        }
    }

    @Override
    public void takeOff() {
        if (chassis == true && engineON == true) {
            System.out.println("Взлетаем");
            chassis = false;
            isFlying = true;
        }

        else {
            System.out.println("Самолет не готов к взлету, проверьте шасси и двигатель.");
            isFlying = false;
        }

    }

    @Override
    public void land() {
        if (chassis == false && engineON == true) {
            System.out.println("Садимся");
            chassis = true;
            isFlying = false;
        }

        else {
            System.out.println("Самолет не готов к Посадке");
        }

    }

    @Override
    void displayInfo() {
        if (isFlying) {
            System.out.println("Самолет находится в воздухе ");
        } else {
            System.out.println("Самолет находится на земле ");
        }

    }
    /*
     * Класс Aircraft (самолеты):
     * 
     * Наследует от Vehicle.
     * Реализует методы абстрактного класса displayInfo.
     * Реализует методы интерфейса Flyable.
     * Добавляет свойства: int maxAltitude (максимальная высота полета), boolean
     * isFlying (флаг состояния полета).
     * Реализует методы:
     * void startEngine() - запуск двигателя самолета.
     * void stopEngine() - остановка двигателя самолета.
     * void takeOff() - взлет самолета.
     * void land() - посадка самолета.
     */
}
