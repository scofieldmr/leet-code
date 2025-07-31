class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;

        for(int i=0;i<prices.length-1;i++){
            if(prices[i+1]-prices[i]>0){
                maxProfit = maxProfit + (prices[i+1]-prices[i]);
            }
        }

        return maxProfit;

    

        // int maxProfit1 = 0;
        // int min1 = Integer.MAX_VALUE;

        // for(int i=0;i<=prices.length/2;i++){
        //     if(prices[i]<min1){
        //         min1=prices[i];
        //     }
        //     else if(prices[i]-min1>maxProfit1){
        //         maxProfit1=prices[i]-min1;
        //     }
        // }

        // int maxProfit2 = 0;
        // int min2 = Integer.MAX_VALUE;

        // for(int i=prices.length/2;i<prices.length;i++){
        //     if(prices[i]<min2){
        //         min2=prices[i];
        //     }
        //     else if(prices[i]-min2>maxProfit2){
        //         maxProfit2=prices[i]-min2;
        //     }
        // }

        // return maxProfit1+maxProfit2;
        
    }
}