class Solution {
    public int majorityElement(int[] nums) {

        int num = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                count++;
            }
            else if (count == 0) {
                num = nums[i];
            }
            else{
                count--;
            }
        }

        return num;
        // Arrays.sort(nums);
        // return nums[nums.length/2];
    }
}