package OOP.Polymorphism;

public class Example {
    interface Payment {
        void pay(double amount);
    }

    static class CreditCardPayment implements Payment {
        @Override
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using Credit Card");
        }
    }

    static class PayPalPayment implements Payment {
        @Override
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using PayPal");
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Payment payment;

            payment = new CreditCardPayment();
            payment.pay(100.50);

            payment = new PayPalPayment();
            payment.pay(200.75);
        }
    }
}
