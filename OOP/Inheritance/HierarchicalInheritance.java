package OOP.Inheritance;

public class HierarchicalInheritance {
    class Parent {
        void show() {
            System.out.println("Parent class");
        }
    }

    class Child1 extends Parent {
        void display() {
            System.out.println("Child1 class");
        }
    }

    class Child2 extends Parent {
        void print() {
            System.out.println("Child2 class");
        }
    }
}
