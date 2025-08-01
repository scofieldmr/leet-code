class Solution {
    public long zeroFilledSubarray(int[] nums) {

        long totalCount = 0;
        long count = 0;


        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
                totalCount = totalCount+count;
            }
            else{
                count=0;
            }
        }

        return totalCount;


        // long count = 0;

        // for(int i=0;i<nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //         if(nums[j]==0){
        //            count++;
        //         }
        //         else{
        //             break;
        //         }
        //      }
        // }

        // return count;
        
    }
}