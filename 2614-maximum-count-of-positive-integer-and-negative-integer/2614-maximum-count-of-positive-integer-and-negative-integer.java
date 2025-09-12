class Solution {
    public int maximumCount(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int negCount = 0;
        while(start <= end) {
            int mid = (start + end) / 2;

            if(nums[mid]<0){
                negCount = mid+1;
                start = mid+1;
            }
            else {
                end = mid - 1;
            }
        }

        start = 0;
        end = nums.length - 1;
        int posCount = 0;
        while(start <= end) {
            int mid = (start + end) / 2;

            if(nums[mid]>0){
                posCount = nums.length - mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return Math.max(posCount,negCount);
        // int negCount = 0;
        // int posCount = 0;

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>0){
        //         posCount++;
        //     }
        //     else if(nums[i]<0){
        //         negCount++;
        //     }
        // }

        // return posCount>negCount?posCount:negCount;
        
    }
}