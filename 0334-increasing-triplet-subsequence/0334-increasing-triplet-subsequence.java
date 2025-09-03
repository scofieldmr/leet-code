class Solution {
    public boolean increasingTriplet(int[] nums) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

         for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= first) {
                first = nums[i];
            }
            else if (nums[i] <= second) {
                second = nums[i];
            }
            else {
                return true;
            }
        }

        return false;
        // for (int i = 0; i < nums.length; i++) {
        //     int j = i+1;
        //     int k = i+2;
        //     if(j< nums.length && k < nums.length) {
        //         if (nums[k] > nums[j] && nums[j] > nums[i]) {
        //             return true;
        //         }
        //     }
        // }

        // return false;
        
    }
}