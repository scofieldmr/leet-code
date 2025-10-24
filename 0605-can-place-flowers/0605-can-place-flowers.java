class Solution {
    public boolean canPlaceFlowers(int[] flower, int n) {  
        int i = 0;

        while(n>0 && i<flower.length){
           if(flower[i]==0){
               boolean left = (i==0) || (flower[i-1]==0);
               boolean right = (i==flower.length-1) || (flower[i+1]==0);
               
               if(left && right){
                   n = n - 1;
                   flower[i] = 1;
               }
           }
           i++;
        }
        
        return n==0;
    }
}