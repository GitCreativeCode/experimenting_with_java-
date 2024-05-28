public class The2DArray {
    
    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {11, 21, 31, 41, 51};
        int[][] bothArrays = {arr1, arr2};
        int[][] twoDArray1 = {{13, 123, 33, 12}, {11, 21, 31, 41}, {3, 11, 24, 12}};
        int[][] twoDArray2 = {{32, 21, 43, 11}, {23, 56, 21, 10}, {1, 5, 2, 7}};

        //Pritns the elemnts of arr1 and arr2
        for (int i=0; i<bothArrays.length; i++) {
            System.out.println();
            for(int j=0; j<bothArrays[i].length; j++) {
                System.out.print(bothArrays[i][j]+" ");
            }
        }
        //adding array
        System.out.println("");
        for (int k=0; k<arr1.length; k++) {
                int addingArrays = arr1[k] + arr2[k];
                System.out.print(addingArrays + " ");
            }

        System.out.println("This is the 2D multiplication Array:" );
        for(int l=0; l<twoDArray1.length; l++){
            for (int i=0; i < twoDArray1[l].length ; i++){
            int result = twoDArray1[l][i] * twoDArray2[l][i];
            System.out.print(result+ " ");
            }
        }
        //printing the adding array
        System.out.println("This is the 2D Adding Array:" );
        for(int l=0; l<twoDArray1.length; l++){
            for (int i=0; i < twoDArray1[l].length ; i++){
            int result = twoDArray1[l][i] + twoDArray2[l][i];
            System.out.print(result+ " ");
            }
        }     
    }
}
