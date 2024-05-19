import java.util.*;
public class IfStatements {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you above 18 years old? ");
        int age = scanner.nextInt();
        scanner.close();

        if (age >= 18){
            System.out.println("You are now 18 years old");
        }
        else if (age >= 13 && age <=17 ){
            System.out.println("You are a youth, what are you doing here?");
        }
        else if (age <= 12){
            System.out.println("You are young, go to your mom!!!");
        }
        else{
            System.out.println("are you");
        }
    }
}
