class Solution {
    public int findDuplicate(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if(nums[i]!=nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j){
                return nums[j];
            }
        }

        return -1;

        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length; i++) {
        //     if(nums[i]==nums[i+1]){
        //       return nums[i];
        //     }
        // }
        // return nums.length;

    
        
    }
}