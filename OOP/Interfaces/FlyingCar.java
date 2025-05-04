package OOP.Interfaces;

public class FlyingCar implements Flyable, Drivable {
    @Override
    public void fly() {
        System.out.println("FlyingCar is flying...");
    }

    @Override
    public void drive() {
        System.out.println("FlyingCar is driving...");
    }
}
