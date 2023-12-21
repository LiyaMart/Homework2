package Homework2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(1, "Audi", "Q5", 2010, 70);

        car1.displayInfo();
        car1.startEngine();
        car1.stopEngine();
        car1.accelerate(50);
        car1.refuel(20, 20);

        Aircraft aircraft2 = new Aircraft(2, "Christen",  "Eagle II", 2000, 5180);

        aircraft2.displayInfo();
        aircraft2.brake();
        aircraft2.takeOff();
        aircraft2.isFlying(); 
        aircraft2.land();
        aircraft2.isFlying();

        Boat boat3 = new Boat(3, "Нептун", "450", 2012, 90);

        boat3.displayInfo();
        boat3.isSailing();
        boat3.startSwimming();
        boat3.isSailing();
        boat3.stopSwimming();
        boat3.isSailing();
    }
}
