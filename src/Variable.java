public class Variable {

    public static void main(String[] args){
        //Creating a variable
        int x; //Declaration variable
        x = 123;
        //or
        int y = 123;

        long i = 13243123;
        // double can hold up to 15 decimal digits
        double d = 312.1313331421;
        //float can hold up to 7 decimal digits
        float f = 31.12134f;
        //A boolean can show eaither true or false
        boolean tORf = true;

        //char can hold up to one character
        char symbol = '@';
        String name = "John";

        System.out.println("My integers number is " + x + " and y is " + y);
        System.out.println("My long number is " + i);
        System.out.println("My double number is " + d + " and float is " + f);
        System.out.println("My boolean is " + tORf);
        System.out.println("char character is: " + symbol + "\nString name is: " + name);


        //Storing variables
        String j = "Water";
        String k = "Kool-Aid";
        String temporarilyString;

        System.out.println("j: " + j);
        System.out.println("k: " + k);

        temporarilyString = j;
        j=k;
        k=temporarilyString;

        System.out.println("j: " + j);
        System.out.println("k: " + k);


    }
    
}
