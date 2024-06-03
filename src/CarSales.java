import java.util.ArrayList;
import java.util.Scanner;

public class CarSales {
    // Variable Declarations
    static Scanner in = new Scanner(System.in);  // Scanner for reading user input
    static ArrayList<Car> carList = new ArrayList<>();  // List to store Car objects

    // Array to initialize car list (format is manufacturer name, model name, car price)
    static String[][] initializeArray = {
            {"Tesla", "Model Y", "50000.00"},
            {"Honda", "Civic", "30000.00"},
            {"Hyundai", "Elantra", "25000.00"},
            {"Honda", "CRV", "32000.00"},
            {"Toyota", "Corolla", "26000.00"},
            {"GMC", "Sierra", "52000.00"},
            {"Toyota", "Rav4", "35000.00"},
            {"Ford", "F Series", "55000.00"},
            {"Dodge", "Ram", "47000.00"},
            {"BMW", "X6", "92000.00"}
    };

    /** Main method */
    public static void main(String[] args) {
        // Initialize car list from the array
        for (String[] carData : initializeArray) {
            String mfg = carData[0];
            String model = carData[1];
            double price = Double.parseDouble(carData[2]);
            carList.add(new Car(mfg, model, price));
        }

        boolean runProgram = true;  // Flag for determining if the user wants to keep running the program

        System.out.println();
        System.out.println("Welcome, what would you like to do?");

        // While the user wishes to run the program
        while (runProgram) {
            int userChoice = getUserChoice();

            // Menu Selections
            switch (userChoice) {
                case 1:  // Show selected Car information
                    showCarInformation();
                    break;
                case 2:  // Delete Car
                    removeACar();
                    break;
                case 3:  // Output Car list to screen
                    displayAllCarList();
                    break;
                case 4:  // Export to file
                    System.out.printf("This is not available yet\n");
                    break;
                case 0:  // Quit
                    runProgram = false;
                    break;
                default:  // If user inputs an invalid number
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }

    /** Displays the menu options for the user
     * @returns Menu selection */
    private static int getUserChoice() {
        // Variable Declarations
        int choice;  // Menu selection

        System.out.println();
        System.out.println("(1) Show Car Information\t(2) Delete Car\t(3) Show Car List " +
                "\t(4) Export to File");
        System.out.println("Enter 0 to quit");

        choice = Integer.parseInt(in.nextLine());

        return choice;
    }

    private static void displayAllCarList() {
        System.out.println("Sales History - 12 months");

        System.out.printf("%-3s %10s    %-8s %4s %12s %12s%n",
                "Idx", "Mfg", "Model",
                "Qty", "Total Sales", "Top Seller");

        for (int i = 0; i < carList.size(); i++) {
            Car car = carList.get(i);
            System.out.printf("%-3s %10s    %-8s %4d %12.2f %12s%n", 
                    i + 1, car.getMfgName(), car.getModelName(),
                    car.getTotalSalesQty(), car.getTotalSalesAmount(), 
                    car.isTopSeller() ? "Yes" : "No");
        }
    }

    private static void removeACar() {
        System.out.print("Enter car index to remove: ");
        int id = in.nextInt();
        in.nextLine(); // consume newline

        if (id > 0 && id <= carList.size()) {
            carList.remove(id - 1);
            System.out.println("Car removed successfully!");
        } else {
            System.out.println("Invalid car index.");
        }
    }

    private static void showCarInformation() {
        System.out.print("Enter Car Index: ");
        int id = in.nextInt();
        in.nextLine();

        if (id > 0 && id <= carList.size()) {
            Car car = carList.get(id - 1);
            System.out.println(car);
            System.out.println("Sales History: ");
            int[] salesHistory = car.getSalesHistory();
            for (int i = 0; i < salesHistory.length; i++) {
                System.out.printf("Month %d: %d units\n", i + 1, salesHistory[i]);
            }
        } else {
            System.out.println("Invalid car index.");
        }
    }
}
