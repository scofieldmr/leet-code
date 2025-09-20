class Solution {
    public int findMin(int[] nums) {
        int pivotIndex =  findPivot(nums);

        return nums[pivotIndex+1];
    }

    public static int findPivot(int [] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if(end>mid && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if(mid>start && nums[mid-1]>nums[mid]) {
                return mid-1;
            }

            if(nums[start]>nums[mid]) {
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}