import java.util.*;
public class LargesNumberHashSet {
    
    public static void main(String[] args) {
        HashSet<Integer> number = new HashSet<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter what ever you but it has to be unique: ");  
       
        while(true) {
            //if the input is quit, it breaks the loop
            if (scanner.hasNext("quit")) {
                break;
            }
            int input = scanner.nextInt();
            //sets a value for sizeBeforeAdd to the current size of things
            int sizeBeforeAdd = number.size();
            //adds the input to the HashSet
            number.add(input);
            //if the size of things is the same as sizeBeforeAdd, it means that the user entered a duplicate value
            if (number.size() == sizeBeforeAdd) {
                System.out.println("You entered a duplicate value: " + input);
            }
        }
        //prints the full HashSet 
        System.out.println(number);
        //finds the largest number
        int max = Integer.MIN_VALUE;
        for (int num: number) {
            if(num > max) {
                max = num;
          }
        }
        System.out.println("The largest number is: " + max);
        scanner.close();
    }
}
