class Solution {
    public int subarraySum(int[] nums, int k) {
 
        int count =0;

        for(int i=0;i<nums.length;i++){
           int sum = 0;
           for(int j=i;j<nums.length;j++){
              sum = sum + nums[j];
               if(sum==k){
                 count++;
                 continue;
               }
           }
        }
        
        return count;
        
        // for(int i=0;i<nums.length;i++){
        //    long subSum = 0;
        //    for(int j=i;j<nums.length;j++){
        //       subSum = subSum + nums[j];

        //       if(subSum==k){
        //         count++;
        //       }
        //     }
        // }

        // return count;
        
    }
}