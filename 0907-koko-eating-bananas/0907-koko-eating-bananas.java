class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            end = Math.max(end, piles[i]);
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            if(check(piles,mid,h)){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return end;
    }

    public static boolean check(int[] piles, int mid , int h) {
        int eat = 0;
        for (int i = 0; i < piles.length; i++) {
            eat = eat + Math.ceilDiv(piles[i], mid);
        }

        return eat <= h;
    }
}