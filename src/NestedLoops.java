import java.util.*;

public class NestedLoops {
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

            System.out.println("Enter number of rows: ");
            int rows = scanner.nextInt();
            System.out.println("Enter number of columns: ");
            int columns = scanner.nextInt();
        

        for (int i=0; i<=columns; i++) {
            System.out.println();
            for (int j=0; j<=rows; j++) {
                System.out.print("*");
            }
        }

        scanner.close();
    }
}

