package OOP.Polymorphism;

//rum time polymorphism
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

    static class Cat extends Animal {
        @Override
        void makeSound() {
            System.out.println("Cat meows");
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Animal myAnimal = new Dog(); // Upcasting
            myAnimal.makeSound();

            myAnimal = new Cat(); // Dynamic method dispatch
            myAnimal.makeSound();
        }
    }
}
