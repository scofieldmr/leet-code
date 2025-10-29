class Solution {
    public int maxSubArray(int[] nums) {
        int maxMin = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int num : nums){
            currentSum += num;
            if(currentSum > maxMin){
                maxMin = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }

        return maxMin;
    }
}