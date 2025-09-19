class Solution {
    public int search(int[] nums, int target) {


        int peakIndex = peakIndex(nums);

        if(peakIndex==-1){
            return search(nums,target,0,nums.length-1);
        }

        if(target == nums[peakIndex]){
            return peakIndex;
        }
        
        if (target >= nums[0]) {
            return search(nums, target, 0, peakIndex-1);
        }


        return search(nums, target, peakIndex + 1, nums.length-1);
        
    }

     public static int search(int[] nums, int target,int start, int end) {
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int peakIndex(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(mid<end && nums[mid]>nums[mid+1]) {
                return mid;
            }
           
            if(mid>start && nums[mid-1]>nums[mid]) {
                return mid-1;
            }

            if (nums[mid] >= nums[start]) {
                start = mid + 1; 
            } else {
                end = mid - 1; 
            }
            
        }
        return -1;
    }
}