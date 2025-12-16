class Solution {
    public int removeDuplicates(int[] nums) {
        int currNum = nums[0];

        int j=1;
        for(int i=1;i<nums.length;i++){
           if(currNum!=nums[i]){
             nums[j] = nums[i];
             currNum = nums[i];
             j++;
           }
        }

        return j;
    }
}