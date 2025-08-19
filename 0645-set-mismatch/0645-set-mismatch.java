class Solution {
    public int[] findErrorNums(int[] nums) {

        int index = 0;
        while (index < nums.length) {
            int correctIndex = nums[index]-1;
            if(nums[index]!=nums[correctIndex]) {
                int temp = nums[index];
                nums[index] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else{
                index++;
            }
        }

        int [] lossNum = {-1,-1};

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=(i+1)){
                return new int[] {nums[i],(i+1)};
            }
        }

        return new int[] {-1,-1};
        
    }
}