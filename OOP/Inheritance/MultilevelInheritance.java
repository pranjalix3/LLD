package OOP.Inheritance;

public class MultilevelInheritance {
    class Grandparent {
        void show() {
            System.out.println("Grandparent class");
        }
    }

    class Parent extends Grandparent {
        void display() {
            System.out.println("Parent class");
        }
    }

    class Child extends Parent {
        void print() {
            System.out.println("Child class");
        }
    }
}
