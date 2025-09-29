class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int result = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < weights.length; i++) {
            start = Math.max(start, weights[i]);
            end = end + weights[i];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(shippingPossible(weights,days,mid)){
                result = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return result;
    }

     public static boolean shippingPossible(int[] weights, int days, int mid) {
        int shipCount = 0;
        int totalWeight = 0;
        int i = 0;
        while(i < weights.length){
            totalWeight += weights[i];
            if(totalWeight == mid){
                shipCount++;
                totalWeight = 0;
            }
            else if(totalWeight > mid){
                shipCount++;
                totalWeight = weights[i];
            }
            i++;
        }

        if(totalWeight>0){
            shipCount++;
        }

        return shipCount<=days;
    }
}