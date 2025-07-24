class Solution {
    public int removeDuplicates(int[] nums) {

        // int j=0;
        // int dup = nums[0];

        // for(int i=1;i<nums.length;i++){
        //     if(dup!=nums[i] && nums[i]!=nums[j]){
        //         nums[++j]=nums[i];
        //         dup=nums[i];
        //     }
        // }

        // return j+1;

        int n = nums[0];
        int j = 1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=n){
               nums[j]=nums[i];
               n =nums[i];
               j++;
            }
            else{
                continue;
            }
        }

        return j;

        
    }
}