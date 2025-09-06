class Solution {
    public int singleNumber(int[] nums) {

        int singleNum = 0;
        
        for(int n : nums){
            singleNum = singleNum ^ n;
        }

        return singleNum;
        
    }
}