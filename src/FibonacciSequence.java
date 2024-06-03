import java.util.*;

/*
 * @author 
 * Date: 2024/05/31
 * Description: This program calculates the nth Fibonacci number and the sum of the Fibonacci sequence up to the nth term.
 */
public class FibonacciSequence {
    private static int fibonacciSequence(int n){
        // Base case: n = 1
        if(n == 1){
            return 1;
        }
        // Recursive case: n > 1
        else if(n > 1){
            // Compute the (n-1)th and (n-2)th Fibonacci numbers
            // and sum them to get the nth Fibonacci number
            return fibonacciSequence(n - 1) + fibonacciSequence(n - 2);
        }
        // Base case: n = 0
        else{
            return 0;
        }
    }


    private static int sumFibonacci(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += fibonacciSequence(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the nth value of n");
        int n = scanner.nextInt();
        
        // Calculate the nth Fibonacci number
        int nthFibonacciNumber = fibonacciSequence(n);
        System.out.println("The nth Fibonacci number: " + nthFibonacciNumber);
        
        // Calculate the sum of the Fibonacci sequence up to the nth term
        int sumOfFibonacciSequence = sumFibonacci(n);
        System.out.println("The sum of the Fibonacci sequence up to the nth term is: " + sumOfFibonacciSequence);
        
        // Close the scanner
        scanner.close();
    }
}
