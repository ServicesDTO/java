package Java_OOP.S2;

public class Program {
    public static void main(String[] args) {
        Car car = new Car(30.0, 70);
        Aircraft ac = new Aircraft(10000, false);
        Boat boat = new Boat(70);


        System.out.println(car.getSpeedLevel());
        car.refuel(100);
        car.startEngine();
        car.accelerate(10);
        System.out.println(car.getSpeedLevel());
        
        car.displayInfo();

        System.out.println("______________________");
        boat.startSwimming();
        boat.startEngine();
        boat.startSwimming();
        boat.displayInfo();

        System.out.println("______________________");
        ac.takeOff();
        ac.startEngine();
        ac.takeOff();
        ac.displayInfo();
        ac.land();
        ac.displayInfo();



    }
}
