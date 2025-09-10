class Solution {
    public void setZeroes(int[][] matrix) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    list.add(i);
                    list.add(j);
                }
            }
        }

       for (int i = 0; i < list.size(); i++) {
           if(i%2==0){
               int temp = list.get(i);
               for(int m=0;m< matrix.length;m++){
                   for(int n=0;n< matrix[0].length;n++){
                        matrix[temp][n]=0;
                   }
               }
           }
           else{
               int temp = list.get(i);
               for(int m=0;m< matrix.length;m++){
                   for(int n=0;n< matrix[0].length;n++){
                       matrix[m][temp]=0;
                   }
               }
           }
       }
        
    }
}