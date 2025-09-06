class Solution {
    public int singleNumber(int[] nums) {

        int bit = 0;
        
        for(int n : nums){
            bit = bit ^ n;
        }

        return bit;
        
    }
}