import java.util.*;

public class ArrayStats {

    //Finds the maximum value in an array
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    //Finds the minimum value in an array
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    //Orders the array from biggest to smalles then prints it
    public static void arrayHighestToLowest_2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void arrayLowestToHighest_2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static String arrayHighestToLowest(int[] array) {
        // Sort the array in descending order
        Arrays.sort(array);
        
        // Convert the array to a string
        StringBuilder sb = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            sb.append(array[i]).append(" ");
        }
        return sb.toString().trim();
    }
    //Orders the array from biggest to smalles then prints it
    public static String arrayLowestToHighest(int[] array) {
        // Sort the array in ascending order
        Arrays.sort(array);
        
        // Convert the array to a string
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]).append(" ");
        }
        return sb.toString().trim();
    }
    
    //Finds the sum of all the elements in an array
    public static int findSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Max: " + findMax(array));
        System.out.println("Min: " + findMin(array));
        System.out.println("Sum: " + findSum(array));
        System.out.println("Array in highest to lowest order:" + arrayHighestToLowest(array));
        System.out.println("Array in lowest to highest order:" + arrayLowestToHighest(array));

        scanner.close();
    }
}
