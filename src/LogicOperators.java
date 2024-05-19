public class LogicOperators {
    //logical operators = used to connect two or more expressions
    
    //&& =  (AND) both conditions must be true
    //|| = (OR) eaither conditions must be true
    // ! = (NOT) reserves boolean value of a condition
    
    public static void main(String[] args){
        int temp = 25;
        if (temp > 30){
            System.out.println("It is hot outside of");
        }
        else if (temp >=20 && temp <=30){
            System.out.println("It is worm outside");
        }
        else{
            System.out.println("It is cold outside");
        }
    }
}
