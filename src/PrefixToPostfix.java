import java.util.*;
/*
 * Prefix to Postfix Conversion
 * @Author 
 * @Date 2024/06/10
 * Description: This program converts a prefix expression to a postfix expression
 */
public class PrefixToPostfix {
    public static boolean isOperator(String x) {
        switch (x) {
            case "+":
            case "-":
            case "/":
            case "*":
                return true;
        }
        return false;
    }

    public static String convert(String expression) {
        Stack<String> stack = new Stack<String>();
        String[] x = expression.split(" ");
        for (int i = x.length - 1; i >= 0; i--) {
            String y = x[i];
            if (isOperator(y)) {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String temp = op1 + " " + op2 + " " + y;
                stack.push(temp);
            } else {
                stack.push(y);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the prefix expression: ");
        String prefixExp = scanner.nextLine();
        System.out.println("Prefix Expression: " + prefixExp);
        System.out.println("Postfix Expression: " + convert(prefixExp));
        scanner.close();
    }
}
