public class MatrixOperations {
    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3, 4, 5}, {12, 2, 3, 5, 2}};
        int[][] array2 = {{13,12,3, 4, 1}, {3,12,3,4,1}}; 
        int[][] result = new int[array1.length][array1[0].length];

        int[][] array3 = {{-2, -6}, {-4, 3}, {5, 0}, {4, -6}};
        int[][] array4 = {{2, -2, 2}, {-2, 0, -3}};
        int[][] result2 = new int[array3.length][array4[0].length];

        for(int i=0; i<array1.length; i++) {
            for(int j=0; j<array1[0].length; j++) {
                result[i][j] = array1[i][j] + array2[i][j];
            }
        }
        for (int i=0; i<result.length; i++) {
            for(int j=0; j<result[0].length; j++){
            System.out.print(result[i][j] + " ");
            }
            System.out.println();
       }

       for (int i = 0; i < array3.length; i++) {
        for (int j = 0; j < array4[0].length; j++) {
            for (int k = 0; k < array3[0].length; k++) { 
                result2[i][j] += array3[i][k] * array4[k][j];
            }
        }
    }

    // Print the result
    for (int i = 0; i < array3.length; i++) {
        for (int j = 0; j < array4[0].length; j++) {
            System.out.print(result2[i][j] + " ");
        }
        System.out.println();
    }

}
}
