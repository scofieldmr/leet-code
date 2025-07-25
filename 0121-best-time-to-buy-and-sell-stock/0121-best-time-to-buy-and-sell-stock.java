class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
        // int maxProfit = 0;

        // for(int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         if(prices[i]>prices[j]){
        //             continue;
        //         }
        //         if(prices[i]<prices[j] && maxProfit<prices[j]-prices[i]){
        //                 maxProfit = prices[j]-prices[i];
        //         }
        //     }
        // }
       

        // return maxProfit;
        
    }
}