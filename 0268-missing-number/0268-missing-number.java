class Solution {
    public int missingNumber(int[] nums) {
        int[] newnums = new int [nums.length+1];

        for(int i=0;i<nums.length;i++){
            int index = nums[i];
            newnums[index]++;
        }

        for(int i=0;i<newnums.length;i++){
            if(newnums[i]==0){
                return i;
            }
        }

        return newnums.length-1;
        // Arrays.sort(nums);
        
        // int i=0;
        // while(i<nums.length){
        //     if(i!=nums[i]){
        //        return i;
        //     }
        //     i++;
        // }

        // return nums.length;
    }
}