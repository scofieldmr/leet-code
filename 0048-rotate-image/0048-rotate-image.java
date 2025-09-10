class Solution {
    public void rotate(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < (matrix[i].length+1)/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length-1-j];
                matrix[i][matrix[i].length-1-j] = temp;
            }
        }

// Using 2d space matrix
        // int[][] tmatrix = new int[matrix.length][matrix[0].length];
        // for(int i = 0; i < matrix.length; i++) {
        //     for(int j = 0; j < matrix[i].length; j++) {
        //         tmatrix[i][j] =  matrix[j][i];
        //     }
        // }

        // for(int i = 0; i < tmatrix.length; i++) {
        //     for(int j = 0; j < (tmatrix[i].length+1)/2; j++) {
        //         int temp = tmatrix[i][j];
        //         tmatrix[i][j] = tmatrix[i][tmatrix[i].length-1-j];
        //         tmatrix[i][tmatrix[i].length-1-j] = temp;
        //     }
        // }

        // for(int i=0;i<matrix.length;i++){
        //     for(int j = 0; j < matrix[i].length; j++) {
        //         matrix[i][j] =  tmatrix[i][j];
        //     }
        // }
        
    }
}