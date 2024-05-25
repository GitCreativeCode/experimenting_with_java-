import java.util.*;
public class PhoneBookTreeMap {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter Name");
        // String name1 = name.nextLine();
        // System.out.println("Enter Phone Number");
        // String phone = name.nextLine();
        phoneBook.put("Name 1", "Phone 1");
        phoneBook.put("Name 2", "Phone 2");
        phoneBook.put("Name 3", "Phone 3");
        phoneBook.put("Name 4", "Phone 4");
        phoneBook.put("Name 5", "Phone 5");

        for (String name : phoneBook.keySet()) {
            System.out.println(name + " = "+ phoneBook.get(name));
        }

        while (true){
            System.out.print("\nEnter a name: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("quit")) {
                break;
            }
            System.out.println(name + " : " + phoneBook.get(name));
        }
        // phoneBook.put(name1, phone);
        
        //System.out.println(phoneBook);
        scanner.close();
    }
}
