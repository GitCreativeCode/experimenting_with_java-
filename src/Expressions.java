public class Expressions {

    public static void main(String[] args){
        
        //Operands = values, variables, numbers, quantity
        //operator = + - / % *

        int friend = 10;
        System.out.println("The number of friends is " + friend);
        friend = friend * 2;
        System.out.println("This is mulipcation of friends \"*\" " +friend);
        friend = friend / 2;
        System.out.println("This is mulipcation of friends \"/\" " +friend);
        friend = friend + 2;
        System.out.println("This is adding of friends \"+\"" +friend);
        friend = friend - 2;
        System.out.println("This is subtracting of friends \"-\" " +friend);
        friend = friend % 2;
        System.out.println("This is the remainder of friends \"%\" " +friend);
        friend = friend++;
        System.out.println("You can add friends by one using \"++\"" +friend);
        friend = friend--;
        System.out.println("You can subtracte by one friends using \"--\"" +friend);
    }
    
}
