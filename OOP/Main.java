package OOP;

public class Main {
    public static void main(String[] args) {

        //Example of an Object
        // Creating an object of the Car class
        Car car1 = new Car("Red", "Toyota", "Corolla", 2020);
        Car car2 = new Car("Blue", "Ford", "Mustang", 2021);

        // Displaying information of each car
        car1.displayInfo();
        System.out.println("-----------------");
        car2.displayInfo();

        car1.start();
        car2.stop();
    }
}
