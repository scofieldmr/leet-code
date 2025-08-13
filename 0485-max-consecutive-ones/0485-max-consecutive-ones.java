class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currCount = 0;
        int maxPrevCount = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                currCount++;
            }
            if(nums[i] == 0){
                if(currCount > maxPrevCount){
                    maxPrevCount = currCount;
                }
                currCount = 0;
            }
        }

        return currCount > maxPrevCount ? currCount:maxPrevCount;
        
    }
}