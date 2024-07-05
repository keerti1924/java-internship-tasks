// Polymorphic Arrays
class Employee {
    void work() {
        System.out.println("Employee works");
    }
}

class Manager extends Employee {
    void work() {
        System.out.println("Manager manages");
    }
}

class Developer extends Employee {
    void work() {
        System.out.println("Developer develops");
    }
}

public class PolymorphicArray {
    public static void main(String[] args) {
        System.out.println("\n5. Polymorphic Arrays\n");
        Employee[] employees = new Employee[3];
        employees[0] = new Employee();
        employees[1] = new Manager();
        employees[2] = new Developer();

        for (Employee emp : employees) {
            emp.work();
        }
    }
}
