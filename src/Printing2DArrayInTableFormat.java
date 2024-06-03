public class Printing2DArrayInTableFormat {
     

     public static void main (String[] args) {
          String[][] table = {
               {"Name", "Age", "City"},
               {"Alice", "30", "New York"},
               {"Bob", "25", "Los Angeles"},
               {"Charlie", "35", "Chicago"},
               {"David", "40", "Houston"},
           };
           
           for (String[] row : table) {
               System.out.printf("%-10s %-10s %-15s%n", row[0], row[1], row[2]);
           }      

     }
}
