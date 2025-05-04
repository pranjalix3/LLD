package OOP.Interfaces;

public class Main {
    public static void main(String[] args) {
        FlyingCar myVehicle = new FlyingCar();
        myVehicle.fly();
        myVehicle.drive();
        myVehicle.stop();

        int result = MathOperations.add(5, 10);
        System.out.println("Sum: " + result);

        Payment payment1 = new CreditCardPayment();
        payment1.pay(100.50);

        Payment payment2 = new PayPalPayment();
        payment2.pay(200.75);

    }
}
