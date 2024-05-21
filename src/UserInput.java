import java.util.*;
public class UserInput {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();

        // Use scanner.nextLine() after scanner.nextInt() 
        //to consume the leftover newline character from input
        scanner.nextLine();
        System.out.println("What is your favourit food? ");
        String food = scanner.nextLine();

        System.out.println("Hello, " + name + "and your age is " + age + "and your favourit food is " + food);
        
        scanner.close();
    }
    
}
