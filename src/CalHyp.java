import java.util.*;
public class CalHyp {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the first side of the triagle: ");
        double x = scanner.nextDouble();
        System.out.println("Enter the length of the second side of the triagle");
        double y = scanner.nextDouble();

        double hyp = Math.sqrt((x*x) + (y*y));

        System.out.println("The hypotenuse of the triagle is: " + hyp);
        scanner.close();
    }
}
