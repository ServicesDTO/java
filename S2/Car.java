
package Java_OOP.S2;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Car extends Vehicle {

    public Car(double fuelLevel, int tankSize) {
        
        if (fuelLevel > tankSize) {
            this.fuelLevel = tankSize;
        } 
        else if (fuelLevel < 0 ){
            this.fuelLevel = 0;
            System.out.println("Уровень топлива не может быть отрицательным!");
        }
        else {
            this.fuelLevel = fuelLevel;
        }
        this.tankSize = tankSize;
    }

    public double getFuelLevel() {
        return this.fuelLevel;
    }

    public boolean isEngineON() {
        return this.engineON;
    }

    public int getSpeedLevel() {
        return this.speedLevel;
    }

    private double fuelLevel;
    private int speedLevel;
    private int tankSize;

    public void startEngine() {
        if (this.fuelLevel == 0) {
            System.out.println("Заправьте бак!");
            this.engineON = false;
        } else if (this.engineON) {
            System.out.println("Двигатель запушен");
        } else {
            this.engineON = true;
            this.fuelLevel -= this.fuelLevel * 0.0005;
        }
    }

    public void stopEngine() {
        System.out.println("Двигатель остановлен");
        if (getSpeedLevel() > 0) {
            brake();
        }
        this.engineON = false;
    }

    public void accelerate(int speed) {
        Random rand = new Random();
        if (this.engineON && this.getFuelLevel() > 0) {
            this.speedLevel += speed;
            this.fuelLevel -= rand.nextInt(speed, speed + 2) * 0.05;
        } else {
            this.brake();
            this.stopEngine();

        }
    }

    public void brake() {
        if (getSpeedLevel() > 0) {
            for (int i = getSpeedLevel(); i == 0; i--) {
                this.speedLevel -= 1;
                try {
                    TimeUnit.SECONDS.sleep(1 / 10);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }

        } else {
            System.out.println("Автомобиль стоит на месте!!!");
        }
    }

    public void refuel(int liters) {
       
        if (isEngineON()) {
            System.out.println("Заглушите двигатель");
        } 
        else {
            if (fuelLevel + liters > tankSize) {
                liters = (int) (liters - tankSize - fuelLevel);
                fuelLevel = (double) tankSize;
                System.out.println("Бак полный:" + fuelLevel + ", остаток " + liters + " литров");
            } else {
                fuelLevel += liters;
            }
        }
    }

    @Override
    void displayInfo() {
        // TODO Auto-generated method stub
        if (engineON) {
            System.out.print("Двигатель запущен,");
        } else {
            System.out.print("Двигатель не запущен,");
        }
        System.out.println("Уровень топлива: " + fuelLevel + ", Текущая скорость: " + speedLevel);
    }

    /*
     * Класс Car (автомобили):
     * 
     * Наследует от Vehicle.
     * Реализует методы абстрактного класса displayInfo.
     * Добавляет свойства: int fuelCapacity (емкость топливного бака), int
     * currentFuelLevel (текущий уровень топлива).
     * Реализует методы:
     * void startEngine() - запуск двигателя автомобиля.
     * void stopEngine() - остановка двигателя автомобиля.
     * void accelerate(int speed) - увеличение скорости автомобиля на указанное
     * значение.
     * void brake() - прекращение движения автомобиля.
     * void refuel(int liters) - заправка автомобиля (увеличение уровня топлива).
     */
}
