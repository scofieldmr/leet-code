class Solution {
    public long zeroFilledSubarray(int[] nums) {

        long totalCount = 0;
        int currentCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                currentCount++;
                totalCount = totalCount + currentCount;
            }
            else{
                currentCount = 0;
            }
        }

        return totalCount;

        
    }
}