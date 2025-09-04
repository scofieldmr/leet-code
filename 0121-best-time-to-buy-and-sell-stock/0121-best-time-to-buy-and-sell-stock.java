class Solution {
    public int maxProfit(int[] prices) {

        int maxProfitPrice = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
            }
            else if (price-minPrice > maxProfitPrice){
                maxProfitPrice = price-minPrice;
            }
        }

        return maxProfitPrice;

        
    }
}