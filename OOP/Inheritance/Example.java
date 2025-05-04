package OOP.Inheritance;

public class Example {
    static class Employee {
        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
        void displayDetails() {
            System.out.println("Employee: " + name + ", Salary: " + salary);
        }
    }

    static class Manager extends Employee {
        double bonus;

        Manager(String name, double salary, double bonus) {
            super(name, salary);
            this.bonus = bonus;
        }
        void displayDetails() {
            super.displayDetails();
            System.out.println("Bonus: " + bonus);
        }
    }
    public static class Main {
        public static void main(String[] args) {
            Manager manager = new Manager("Alice", 70000, 10000);
            manager.displayDetails();
        }
    }
}
