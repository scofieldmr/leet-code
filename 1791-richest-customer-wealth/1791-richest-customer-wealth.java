class Solution {
    public int maximumWealth(int[][] accounts) {

        int maxWealth = Integer.MIN_VALUE;

        for(int [] a : accounts){
            int sum = sumOfAcc(a);
            if(sum>maxWealth){
                maxWealth = sum;
            }
        }

        return maxWealth;
        
    }

    private static int sumOfAcc(int [] account){
        int sum = 0;
        for(int i:account){
           sum = sum + i;
        }

        return sum;
    }
}