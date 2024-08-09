class Employee {
    // Private variables (Encapsulation)
    private String name;
    private int id;
    private double salary;

    // Constructor to initialize the object
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Public methods to get and set the values (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee("Keerti Sharma", 101, 50000);
        emp.displayDetails();

        // Modifying employee details using setters
        emp.setName("Keerti Sharma");
        emp.setSalary(55000);
        emp.displayDetails();
    }
}
