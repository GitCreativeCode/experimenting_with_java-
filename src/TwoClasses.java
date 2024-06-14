import java.util.*;

public class TwoClasses {
    public static void main(String[] args) {
        AnotherClass stack = new AnotherClass();
        System.out.println(stack.maxSize);
        stack.push("a");
      //   stack.push("b");
      //   stack.push("c");
        System.out.println(stack.toString());
        System.out.println(stack.pop());
        System.out.println(stack.toString());
        System.out.println(stack.peek());
    }
}

class AnotherClass extends TwoClasses{
   int maxSize;
   int top;
   String arr[];

   public AnotherClass () {
      maxSize = 3 ;
      arr = new String [maxSize];
      top = 0;
   }
   
   public Boolean empty() {
      if (top == 0)
         return true;
      else 
         return false;
   }

   public void push (String str) {
      arr[top] = str;
      top++;
   }

   public String pop() {
      if (top > 0) {
         String temp = arr[top-1];
         arr[top-1] = null;
         top --;
         return temp;
      }
      else return null;
   }

   // public String peek () {
   //    return arr[top-1];
   // }
   public String peek() {
    if (top == 0)
       return null;
    else
       return arr[top-1];
   }
   
   public String toString() {
      return Arrays.toString(arr);
   }
   
}