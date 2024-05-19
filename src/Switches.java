public class Switches {
    
    public static void main(String[] args){
        //switch statement selects one of many code blocks to be executed 
        //based on the value of a given expression.
        String day = "Friday";

        //I want to test the Stirg day for an inequality condition.
        switch(day) {
            case "Sunday": System.out.println("lt is Sunday!");
            break;
            case "Monday": System.out.println("lt is Monday!");
            break;
            case "Tuesday": System.out.println("lt is Tuesday!");
            break;
            case "Wednesday": System.out.println("lt is Wednesday!");
            break;
            case "Thursday": System.out.println("lt is Thursday!");
            break;
            case "Friday": System.out.println("lt is Friday!");
            break;
            case "Saturday": System.out.println("lt is Saturday!");
            break;
            //when none of them match
            default: System.out.println("This is not a valid day");
        }
    }
}
