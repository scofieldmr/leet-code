class Solution {
    public int[] leftRightDifference(int[] nums) {

        int [] leftSumArr = new int[nums.length];
        int [] rightSumArr = new int[nums.length];

        int leftSum = 0;
        int rightSum = 0;
        int j=nums.length-1;

        for (int i = 0; i < nums.length; i++) {
            leftSumArr[i] = leftSum;
            rightSumArr[j] = rightSum;
            leftSum += nums[i];
            rightSum += nums[j];
            j--;
        }

        int[] difference = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            difference[i] = Math.abs(leftSumArr[i] - rightSumArr[i]);
        }

        return difference;

        
    }
}