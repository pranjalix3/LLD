package OOP.Inheritance;

public class SuperKeyword {
    static class Animal {
        Animal() {
            System.out.println("Animal Constructor");
        }
        void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        Dog() {
            super(); // Calls the parent class constructor
            System.out.println("Dog Constructor");
        }
        void makeSound() {
            super.makeSound(); // Calls parent method
            System.out.println("Dog barks");
        }
    }
    public static class Main {
        public static void main(String[] args) {
            Dog myDog = new Dog();
            myDog.makeSound();
        }
    }
}
