import java.util.*;
public class StringClass {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type: OK ");
        String word = scanner.nextLine();

        //This should compare what the user typed and this word
        boolean result = word.equals("OK");
        //This should not care about the Cases of the letters
        boolean result2 = word.equalsIgnoreCase("ok");
        System.out.println(result + "\n" + result2);

        System.out.println("Enter word: ");
        String word2 = scanner.nextLine();
        //How many characters in the word
        int result3 = word2.length();
        //This should give the first letter of the word (this can be changed by changing the index)
        char result4 = word2.charAt(0);
        //This would find if there is that character in the word
        int result5 = word2.indexOf("a");
        //Returns a boolan if there is a character in the word
        boolean result6 = word2.isEmpty();
        //Makes the whole word upper case
        String result7  = word2.toUpperCase();
        //Makes the word lower case
        String result8 = word2.toLowerCase();
        //Removes any spaces before and after the word
        String result9 = word2.trim();
        //This replaces the character "o" to "a"
        String result10 = word2.replace("o", "a");

        System.out.println("There are " + result3 + "characters in the word" + "\nThe first letter is: " + result4 + "\nThe index which letter a is at: " + result5 + "\nIs it empty? " + result6);
        System.out.println(result7 + "\n" + result8 + "\n" + result9 + "\n" + result10);

        scanner.close();
    }
}
