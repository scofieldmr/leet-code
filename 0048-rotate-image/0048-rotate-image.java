class Solution {
    public void rotate(int[][] matrix) {
            
         int[][] trp = new int[matrix.length][matrix[0].length];

         for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                trp[i][j] = matrix[j][i];
            }
        }

         for(int [] row : trp){
             for(int j=0; j<(row.length+1)/2; j++) {
                 int temp = row[j];
                 row[j] = row[row.length-j-1];
                 row[row.length-j-1] = temp;
             }
         }
          
         for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = trp[i][j];
            }
        }
        
    }
}