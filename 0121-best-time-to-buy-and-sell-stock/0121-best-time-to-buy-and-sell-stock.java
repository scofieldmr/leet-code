class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for(int p: prices){
            min = Math.min(min,p);
            if(p-min>maxProfit){
                maxProfit = p-min;
            }
        }

        return maxProfit;
    }
}