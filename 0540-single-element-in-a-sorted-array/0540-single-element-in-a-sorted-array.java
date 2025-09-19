class Solution {
    public int singleNonDuplicate(int[] nums) {

        int sum = 0;
        for(int n:nums){
            sum = sum^n;
        }
        return sum;
        
    }
}