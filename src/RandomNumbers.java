import java.util.*;
public class RandomNumbers {
    
    public static void main(String[] args){

        Random random = new Random();

        //Random integer values through 1 - 6
        //Adding +1 that is becuase java starts with 0
        int x = random.nextInt(6)+1;
        System.out.println(x);

        //Random double values from 0 to 1
        double y = random.nextDouble();
        System.out.println(y);

        //Random boolean eaither ture or false
        boolean z = random.nextBoolean();
        System.out.println(z);
    }
}
