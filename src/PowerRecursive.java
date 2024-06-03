import java.util.Scanner;
/*
 * Date: 2024/05/30
 * @author
 * Description: This program calculates the power of a number using recursion
 */
public class PowerRecursive{
    public static double Power (int base, int n){
        // Base case: if n is 0, the power is 1
        if (n == 0){
            return 1;
        }
        // Positive exponent case: the power is the base multiplied by the power of the base with the exponent decreased by 1
        else if (n >0 ){
            return base * Power(base, n-1);
        }
        // Negative exponent case: the power is the reciprocal of the base multiplied by the power of the base with the absolute value of the exponent decreased by 1
        else if(n<0){
            return 1 / (base* Power(base,(-1 * n)-1));
        }
        // Invalid exponent case: returns 0
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base = number.nextInt();
        System.out.println("Enter the power: ");
        int power = number.nextInt();
        System.out.println(Power(base, power));
        number.close();
    }
}