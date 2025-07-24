class Solution {
    public int removeDuplicates(int[] nums) {

        int j=1;
        int dup = nums[0];

        for(int i=0;i<nums.length;i++){
            if(dup!=nums[i]){
                nums[j]=nums[i];
                dup=nums[i];
                j++;
            }
        }

        return j;

        // int n = nums[0];
        // int j = 1;

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=n){
        //        nums[j]=nums[i];
        //        n =nums[i];
        //        j++;
        //     }
        // }

        // return j;

        
    }
}