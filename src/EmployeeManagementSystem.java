import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeManagementSystem {
    private static ArrayList<Employee> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\nEmployee Management System:");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Sort Employees by Salary");
            System.out.println("5. Convert and Display Salary");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    removeEmployee();
                    break;
                case 3:
                    displayAllEmployees();
                    break;
                case 4:
                    sortEmployeesBySalary();
                    break;
                case 5:
                    convertAndDisplaySalary();
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Step 5: Implement the addEmployee Method
    private static void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Check if the ID already exists
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                System.out.println("Employee ID already exists. Please enter a unique ID.");
                return;
            }
        }

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        employees.add(new Employee(id, name, salary));
        System.out.println("Employee added successfully!");
    }

    // Step 6: Implement the removeEmployee Method
    private static void removeEmployee() {
        System.out.print("Enter Employee ID to remove: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        employees.removeIf(employee -> employee.getId() == id);
        System.out.println("Employee removed successfully!");
    }

    // Step 7: Implement the displayAllEmployees Method
    private static void displayAllEmployees() {
        System.out.printf("%-5s %-15s %-10s\n", "ID", "Name", "Salary");
        System.out.println("----------------------------");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    // Step 8: Implement the sortEmployeesBySalary Method
    private static void sortEmployeesBySalary() {
        Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Employees sorted by salary.");
    }

    // Step 9: Implement the convertAndDisplaySalary Method
    private static void convertAndDisplaySalary() {
        System.out.print("Enter Employee ID to convert salary: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Employee employee = employees.stream()
            .filter(e -> e.getId() == id)
            .findFirst()
            .orElse(null);

        if (employee != null) {
            double salary = employee.getSalary();
            System.out.println("Salary as String: " + String.valueOf(salary));
            System.out.println("Salary in Integer: " + (int) salary);
            System.out.println("Salary in Binary: " + Integer.toBinaryString((int) salary));
        } else {
            System.out.println("Employee not found.");
        }
    }
}
