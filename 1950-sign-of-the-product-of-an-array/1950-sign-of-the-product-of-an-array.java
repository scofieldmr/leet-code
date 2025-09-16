class Solution {
    public int arraySign(int[] nums) {
        int negCount = 0;

        for(int n : nums) {
            if(n<0){
                negCount++;
            }
            else if(n==0){
                return 0;
            }
        }
        
        if(negCount%2!=0){
            return -1;
        }

        return 1;
       
    }
}