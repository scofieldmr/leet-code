class Solution {
    public int findDuplicate(int[] nums) {
        


        int index = 0;
        while (index < nums.length) {
            int correctIndex = nums[index];
            if(nums[index]!=nums[correctIndex]) {
                int temp = nums[index];
                nums[index] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else{
                index++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i){
                return nums[i];
            }
        }

        return nums.length;
        
    }
}