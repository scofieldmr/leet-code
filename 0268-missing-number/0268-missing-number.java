class Solution {
    public int missingNumber(int[] nums) {

        int[] nums1 = new int[nums.length+1];

        for (int i = 0; i < nums.length; i++) {
            int index = nums[i];
            nums1[index] = 1;
        }

        for (int i = 1; i < nums1.length; i++) {
            if(nums1[i] == 0){
                return i;
            }
        }
        
        return 0;
    }
}