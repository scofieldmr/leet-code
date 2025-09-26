class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sqnums = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            sqnums[i] = nums[i]*nums[i];
        }

        Arrays.sort(sqnums);
        return sqnums;
    }
}