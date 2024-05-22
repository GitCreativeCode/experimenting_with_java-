import java.io.*;
import java.util.*;
public class BufferReadAndWrite{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //The user enters a file name and checks of what is being inputed
        System.out.println("Eaither enter a file name (include \".txt\"), or a directory: ");
        String fileName = scanner.nextLine();
        while(fileName.isBlank() || !fileName.endsWith(".txt") || !new File (fileName).exists()){
            System.out.println("Invalid input the right directory");
            fileName = scanner.nextLine();
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            
            System.out.print("How many lines are you going to write?: ");
            int lines = scanner.nextInt();
            while(lines < 0){
                System.out.println("Invalid number, re-enter an integer: ");
                lines = scanner.nextInt();
            }
            for (int i = 0; i < lines+1; i++) {
                System.out.print("");
                String input = scanner.nextLine();
                writer.write("\n" + input);
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