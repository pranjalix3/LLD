package OOP.Polymorphism;

public class PolyWithInterface {
    interface Vehicle {
        void start();
    }

    static class Car implements Vehicle {
        public void start() {
            System.out.println("Car is starting...");
        }
    }

    static class Bike implements Vehicle {
        public void start() {
            System.out.println("Bike is starting...");
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Vehicle myVehicle = new Car();
            myVehicle.start();

            myVehicle = new Bike();
            myVehicle.start();
        }
    }
}
