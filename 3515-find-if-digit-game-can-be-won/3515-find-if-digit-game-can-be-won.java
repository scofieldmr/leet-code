class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum = 0;
        int dsum = 0;

        for(int n : nums){
            if(n<10){
                sum  = sum + n; 
            }
            else{
                dsum = dsum + n;
            }
        }
         
        if(dsum==sum){
            return false;
        }


        return true;
        
    }
}