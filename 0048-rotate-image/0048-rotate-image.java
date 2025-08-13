class Solution {
    public void rotate(int[][] matrix) {
            
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

         for(int [] row : matrix){
             for(int j=0; j<(matrix.length+1)/2; j++) {
                 int temp = row[j];
                 row[j] = row[row.length-j-1];
                 row[matrix.length-j-1] = temp;
             }
         }
        
        
    }
}