import javax.swing.*;
public class SimpleGUIApp {
    
    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello, " + name);

        //JOptionPane.showInputDialog gest the input as a String, and then Integer.parseInt()
        //converts that String to an integer
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your name"));
        JOptionPane.showMessageDialog(null,"Your age is " + age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your name"));
        JOptionPane.showMessageDialog(null,"Your hight is " + height);
    }
}
