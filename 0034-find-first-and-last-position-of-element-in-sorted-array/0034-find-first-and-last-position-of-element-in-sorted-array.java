class Solution {
    public int[] searchRange(int[] nums, int target) {

        int [] result = {-1,-1}; 

        if(nums.length==1 && target==nums[0]){
            return new int[]{0,0};
        }

        if(nums.length==1 && target!=nums[0]){
            return result;
        }

        result[0] = firstAndLastOccurrence(nums,target,true);

        if(result[0] != -1){
            result[1] = firstAndLastOccurrence(nums,target,false);
        }

        return result;
    }

    public static int firstAndLastOccurrence(int[]nums,int target,boolean firstOccurrence){
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;

            if (nums[mid] == target && firstOccurrence==true) {
                    if (mid>start && nums[mid - 1] == target) {
                        end = mid - 1;
                    } else {
                        return mid;
                    }
                }
            if (nums[mid] == target && firstOccurrence==false ) {
                    if(end>mid && nums[mid + 1] == target) {
                        start = mid + 1;
                    }
                    else {
                        return mid;
                    }
            }

            if(nums[mid]<target){
                start = mid + 1;
            }
            else if(nums[mid]>target) {
                end = mid - 1;
            }
        }
        return -1;
    }
}