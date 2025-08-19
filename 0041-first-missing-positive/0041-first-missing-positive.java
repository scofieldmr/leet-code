class Solution {
    public int firstMissingPositive(int[] nums) {
         int index = 0;
        while (index < nums.length) {
            int correctIndex = nums[index]-1;
            if(nums[index] <= nums.length && nums[index] >0 && nums[index]!=nums[correctIndex]) {
                    int temp = nums[index];
                    nums[index] = nums[correctIndex];
                    nums[correctIndex] = temp;
            }
            else{
                index++;
            }
        }


        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i+1){
                return i+1;
            }
        }

       return nums.length+1;
        
    }
}