public class Employee {
    // Class attributes
    private int id;
    private String name;
    private double salary;

    // Constructor to initialize attributes
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter method for id
    public int getId() {
        return id;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for salary
    public double getSalary() {
        return salary;
    }

    // toString method for formatted display
    @Override
    public String toString() {
        return String.format("%-5d %-15s %-10.2f", id, name, salary);
    }
}
