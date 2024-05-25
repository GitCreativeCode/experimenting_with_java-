import java.util.*;
public class NumberHashSet {
    
    public static void main(String[] args) {
        HashSet<String> things = new HashSet<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter what ever you but it has to be unique: ");  
       
        while(true) {
            String input = scanner.nextLine();
            //if the input is quit, it breaks the loop
            if (input.equals("quit")) {
                break;
            }
            //sets a value for sizeBeforeAdd to the current size of things
            int sizeBeforeAdd = things.size();
            //adds the input to the HashSet
            things.add(input);
            //if the size of things is the same as sizeBeforeAdd, it means that the user entered a duplicate value
            if (things.size() == sizeBeforeAdd) {
                System.out.println("You entered a duplicate value: " + input);
            }
        }
        System.out.println(things);
        scanner.close();
    }
}
