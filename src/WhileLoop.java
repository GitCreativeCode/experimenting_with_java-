import java.util.*;
public class WhileLoop {
    
    public static void main(String[] args){
        // while loop executes a block of code as long as a it's condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()){
            System.out.print("Enter you name: ");
            name = scanner.nextLine();
        }

        // or using do while loop which does do first then checks
        do{
            System.out.print("Enter you name: ");
            name = scanner.nextLine();
        }while(name.isBlank());
        
        System.out.println("Hello, " + name);
    }
}
