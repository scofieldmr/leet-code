class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int max = Integer.MIN_VALUE;
        for(int a : piles){
            max = Math.max(max,a);
        }
        int end = max;

        while(start < end){
            int mid = start + (end - start)/2;

            int eatingBanana = eatingBananas(piles,mid);

            if(eatingBanana <= h){
                end = mid;
            }
            else {
                start = mid+1;
            }
        }

        return start;
    }
    public static int eatingBananas(int[] arr,int k) {
        int eatingBananas = 0;
        for(int a : arr){
            eatingBananas = eatingBananas + Math.ceilDiv(a,k);
        }
        return eatingBananas;
    }
}