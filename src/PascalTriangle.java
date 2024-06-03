import java.util.Scanner;

/*
 * @author  
 * Date: 2024/05/30
 * Description: This program calculates the power of a number using recursion
 */
public class PascalTriangle {
 public int[][] terms;

    
    private PascalTriangle(int n){
        this.terms = pascalTriangle(n);

    }
    
     // Recursively calculates the value of the element at 
     //the specified row and column of a Pascal's triangle. 
    private int pascalTriangle(int row, int column){
        // Base case: if the column is 0 or the row is equal to the column, the value is 1
        if (column == 0 || column == row){
            return 1;
        }
        // Recursive case: calculate the value by summing the values of 
        //the elements above and to the left and above and to the right
        return pascalTriangle(row - 1, column - 1) + pascalTriangle(row - 1, column);
    }
    
    private int[][] pascalTriangle(int n) {
        int[][] terms = new int[n+1][n+1];
        for (int i=0; i <= n; i++){
            for(int j = 0; j<= i; j++){  
            terms[i][j] = pascalTriangle(i,j);  
        }
    }
        return terms;
    }
    
    //Prints the Pascal's triangle
    public void printPascal() {
        // Iterate over each row of the Pascal's triangle
        for (int[] row : terms) {
            // Iterate over each element in the row
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }  
     
    public static void main(String[] args) {
        
        Scanner row = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n = row.nextInt();

        PascalTriangle triangle = new PascalTriangle(n);
        triangle.printPascal();

        System.out.println("Enter number of row: ");
        int rows = row.nextInt();
        System.out.println("Enter number of columns: ");
        int columns = row.nextInt();

        System.out.println("The value at row " + rows + " and column " + columns + " is " + triangle.pascalTriangle(rows, columns));
        
        row.close();
    }
}
