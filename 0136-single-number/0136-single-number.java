class Solution {
    public int singleNumber(int[] nums) {
        int snum = 0;
        for(int n : nums){
            snum = snum ^ n;
        }

        return snum;
    }
}