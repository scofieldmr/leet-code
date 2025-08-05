class Solution {
    public int findMiddleIndex(int[] nums) {

                int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
  

        int newSum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum - nums[i];

            if(newSum == sum){
                return i;
            }
            newSum += nums[i];
        }

        return -1;
        
    }
}