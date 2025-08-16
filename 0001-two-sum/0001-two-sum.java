class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] range = {-1,-1};
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    range[0] = i;
                    range[1] = j;
                }
            }
        }

        return range;
        
    }
}