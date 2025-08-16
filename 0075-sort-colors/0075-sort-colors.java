class Solution {
    public void sortColors(int[] nums) {
        int [] newNums = new int[nums.length];

        if(nums.length<=1){
            return;
        }

        int p = 0;
        for (int i = 0; i <= nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[j]==i){
                    newNums[p]=nums[j];
                    p++;
                }
            }
        }

        for(int i=0;i<newNums.length;i++){
            nums[i] = newNums[i];
        }


        // Arrays.sort(nums);
        
    }
}