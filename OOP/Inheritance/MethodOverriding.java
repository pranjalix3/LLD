package OOP.Inheritance;

public class MethodOverriding {
    static class Animal {
        void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Dog barks");
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Animal myAnimal = new Dog(); // Polymorphism
            myAnimal.makeSound();
        }
    }
}
