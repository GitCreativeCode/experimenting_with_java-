import java.util.*;
/*
 * @athor
 * Date: 2024/05/31
 * Description: This program mirrors a string
 */
public class Mirroring{
    public static String mirroring(String sentence){
        // If the string is empty, return the empty string
        if(sentence.isEmpty()){
            return "";
        }
        // Recursively call the mirroring function on the substring of the
        // original string, starting from the second character
        // Add the first character of the original string to the end of the
        // mirrored string
        return mirroring(sentence.substring(1))+sentence.charAt(0); 
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you word to mirror it! ");
        String sentence = scanner.nextLine();
        System.out.println(mirroring(sentence)); 
        scanner.close();
    }
}
