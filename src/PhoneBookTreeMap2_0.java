import java.io.*;
import java.util.*;
public class PhoneBookTreeMap2_0 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        TreeMap<String, String> phoneBook = new TreeMap<>();
        //Sets fileName to PhoneBook.txt
        String fileName = "PhoneBook.txt";
        
        // Load existing contacts from the file into the TreeMap
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" : ");
                if (parts.length == 2) {
                    phoneBook.put(parts[0], parts[1]);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No existing phone book found, a new one will be created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        while (true) {
            System.out.println("Want to add a new contact? (y/n)");
            String choice = scanner.nextLine().toLowerCase();
            //Creating a new contact
            if(choice.equals("y") || choice.equals("yes")){
                System.out.println("Enter Name");
                String name = scanner.nextLine();
                
                System.out.println("Enter Phone Number");
                String phone = scanner.nextLine();
                phoneBook.put(name, phone);
                
                if (name.equalsIgnoreCase("quit")) {
                    break;
                }
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
                    writer.write(name + " : " + phone + "\n");
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("your Contact list has been updated!");
            }
            //View the contact list
            else if(choice.equals("n") || choice.equals("no")){
                // Print all contacts from TreeMap
                for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                    //Prints all contacts names
                    System.out.println(entry.getKey());
                    //Prints all contacts names and phone numbers
                    //System.out.println(entry.getKey() + " : " + entry.getValue());
                }
                System.out.println("Enter a name in your contact list (type 'quit' to exit): ");
                String name = scanner.nextLine();
                String phone = phoneBook.get(name);
                if (phone != null) {
                    System.out.println(name + " : " + phone);
                } else {
                    System.out.println("Contact not found.");
                }
            } else if (choice.equalsIgnoreCase("quit")) {
                break;
            } else {
                System.out.println("Please enter 'y', 'yes', 'n', 'no' or 'quit'.");
            }
        }
        scanner.close();
    }
}
        
