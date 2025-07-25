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
        // int minPrice = Integer.MAX_VALUE;
        // for(int i=0;i<prices.length;i++){
        //      if(prices[i]<minPrice){
        //             minPrice = prices[i];
        //       }
        //       else if(prices[i]-minPrice>maxProfit){
        //                 maxProfit = prices[i]-minPrice;
        //         }
        //     }

        // return maxProfit;
        
    }
}