import java.io.*;
import java.util.*;
public class BufferReadAndWrite{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //The user enters a file name and checks of what is being inputed
        System.out.println("Eaither enter a file name (include \".txt\"), or a directory: ");
        String fileName = scanner.nextLine();
        while(fileName.isBlank() || (!fileName.endsWith(".txt") && !new File (fileName).exists())){
            System.out.println("Invalid input the right directory");
            fileName = scanner.nextLine();
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            System.out.print("How many lines are you going to write?: ");
            while (true) {
                if (scanner.hasNextInt()) {
                    int lines = scanner.nextInt();
                    if (lines > 0) {
                        for (int i = 0; i < lines; i++) {
                            System.out.print("");
                            String input = scanner.next();
                            writer.write(input + "\n");
                        }
                        break;
                    } else {
                        System.out.println("Invalid number. Please enter a non-negative integer: ");
                    }
                } else {
                    System.out.println("Invalid input. Please enter an integer: ");
                    scanner.next(); // Consume the invalid input
                }
            }
            scanner.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String readLines;
            while((readLines = reader.readLine()) != null){
                System.out.println(readLines);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}