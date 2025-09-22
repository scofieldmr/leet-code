class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        if(nums.length>threshold){
             return -1;
         }
         int start = 0;
         int maxi = Integer.MIN_VALUE;
         for(int n : nums) {
            maxi = Math.max(maxi,n);
         }
         int end = maxi;

         while (start <= end) {
             int mid = start + (end - start) / 2;

             int sum = SumOfArray(nums, mid);

             if(sum <= threshold) {
                 end = mid-1;
             }
             else {
                 start = mid + 1;
             }
         }
         return start;
    }

     public static int SumOfArray(int[] nums,int divisor) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Math.ceil((double)(nums[i]) / (double)(divisor));
        }
        return sum;
    }

    // public static int maxInArray(int[] nums) {
    //     int max = Integer.MIN_VALUE;
    //     for (int i = 0; i < nums.length; i++) {
    //         if (nums[i] > max) {
    //             max = nums[i];
    //         }
    //     }
    //     return max;
    // }
}