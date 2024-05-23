import java.util.*;
public class LargestNumberArrayList {
    
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);
        //prompt user to enter numbers
        System.out.println("Enter as many numbers as you want, and to stop type \"stop\" ");
        //store the numbers in an ArrayList
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (true) {
            //check if the user wants to stop
            if(numInput.hasNext("stop")) {
                break;
            }
            //check if the user entered a number
            else if (numInput.hasNextInt()){
            int num = numInput.nextInt();
                numbers.add(num);
        }
            else{
                System.out.println("Invalid input, please try again");
                numInput.next();
            }
        }
        System.out.println("The numbers you entered are: " + numbers + " ");

        //sort the list in ascending order
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                if (numbers.get(i) < numbers.get(j)) {
                    int temp = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, temp);
                }
            }
        }
        //find the largest number using for loop
        int max = numbers.get(0);
        for (int i=0; i<numbers.size(); i++) {
            if(numbers.get(i) > max){
                max = numbers.get(i);
            }
        }
        //print the results of the ascending order
        System.out.println("The numbers in ascending order are: " + numbers);
        //print the results of the largest number using the ascending order
        System.out.println("The largest number is: " + numbers.get(numbers.size()-1));
        //print the results of the largest number using for loop
        System.out.println("The largest value is: " + max);
        //close the scanner
        numInput.close();
    }
}
