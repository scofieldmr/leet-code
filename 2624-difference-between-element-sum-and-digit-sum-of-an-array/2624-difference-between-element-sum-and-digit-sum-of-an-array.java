class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digSum = 0;
        for(int n:nums){
            sum = sum + n;
            while(n>9){
                int rem = n%10;
                digSum = digSum + rem;
                n = n/10;
            }
            digSum = digSum + n;
        }
        

        return Math.abs(sum-digSum);
    }
}