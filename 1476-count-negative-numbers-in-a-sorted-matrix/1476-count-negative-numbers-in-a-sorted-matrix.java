class Solution {
    public int countNegatives(int[][] grid) {
        int sum = 0;
        for (int nums[] :grid) {
            sum = sum + countNegatives(nums);
        }

        return sum;
    }

     private static int countNegatives(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = nums.length - 1;
        int negCount = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid]<0){
                negCount = n - mid;
                end = mid - 1;
            }
            else{
                start = mid+1;
            }
        }

        return negCount;
    }
}