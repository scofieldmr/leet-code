class Solution {
    public int singleNumber(int[] nums) {
        int firstOne = 0;
        int secOne = 0;

        for(int n :nums){
            firstOne = (firstOne ^ n) & ~secOne;
            secOne = (secOne^n) & ~firstOne;
        }

        return firstOne;
    }
}