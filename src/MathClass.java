public class MathClass {
    
    public static void main(String[] args){
        double x = 12.12;
        double y = 42.31;
        double g = -12313.213;

        System.out.println("Number x: " + x + " and the number y: " + y + " and the hieghts is the number: " + Math.max(x, y));
        System.out.println("The absolute value of the number: " + g + " is: " + Math.abs(g));
        System.out.println("The square root of the number: " + x + " is: " + Math.sqrt(x));
        System.out.println("The round of the number: " + x + " is: " + Math.round(x));
        System.out.println("The round up of the number: " + y + " is: " + Math.ceil(y));
        System.out.println("The round down of the number: " + x + " is: " + Math.floor(x));

    }
}
