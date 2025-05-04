package OOP.Inheritance;

public class SingleInheritance {
    class Parent {
        void show() {
            System.out.println("This is the parent class");
        }
    }

    class Child extends Parent {
        void display() {
            System.out.println("This is the child class");
        }
    }
}
