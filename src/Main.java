import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] animals = {
            {"Lion", "Tiger", "Elephant"},
            {"Dog", "Cat", "Rabbit"},
            {"Horse", "Cow", "Sheep"}
        };

        System.out.println("Enter the row index:");
        int row = scanner.nextInt();
        System.out.println("Enter the column index:");
        int col = scanner.nextInt();

        if (row >= 0 && row < animals.length && col >= 0 && col < animals[row].length) {
            System.out.println("The animal at index [" + row + "][" + col + "] is " + animals[row][col]);
        } else {
            System.out.println("Invalid index. Please enter a valid index.");
        }
    }
}
