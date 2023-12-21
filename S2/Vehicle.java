package Java_OOP.S2;

public abstract class Vehicle {
    protected int id;
    protected String brand;
    protected String model;
    protected int year;
    protected boolean engineON = false;

    protected void startEngine() {
    }

    protected void stopEngine() {
    }

    protected void accelerate(int speed) {
    }

    protected void brake() {
    }

    abstract void displayInfo();

    /*
     * Абстрактный класс Vehicle:
     * 
     * Содержит общие свойства и методы для всех видов транспортных средств.
     * Свойства: int id (уникальный идентификатор), String brand (марка), String
     * model (модель), int year (год выпуска).
     * Методы:
     * void startEngine() - запуск двигателя (реализация в подклассах).
     * void stopEngine() - остановка двигателя (реализация в подклассах).
     * void accelerate(int speed) - увеличение скорости на указанное значение
     * (реализация в подклассах).
     * void brake() - прекращение движения (реализация в подклассах).
     * abstract void displayInfo() - вывод информации о транспортном средстве
     * (реализация в подклассах).
     * 
     * 
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
     * 
     * Создайте объекты различных транспортных средств (автомобиль, самолет, лодка).
     * Продемонстрируйте их работу, вызывая соответствующие методы (запуск
     * двигателя, движение, взлет, посадка и т.д.).
     * Выведите информацию о каждом транспортном средстве с использованием метода
     * displayInfo.
     */

}
