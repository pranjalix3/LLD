package OOP.Interfaces;

public interface Drivable {
    void drive();
    // Default method with implementation
    default void stop() {
        System.out.println("Stopping...");
    }
}
