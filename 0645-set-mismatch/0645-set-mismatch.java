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

        int [] lossNum = new int[2];

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=(i+1)){
                lossNum[0] = nums[i];
                lossNum[1] = i+1;
            }
        }

        return lossNum;
        
    }
}