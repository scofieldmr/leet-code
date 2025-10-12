class Solution {
    public int maximumCandies(int[] candies, long k) {

        long start = 1;
        long end = Integer.MIN_VALUE;
        for(int c:candies) {
            end = Math.max(end, c);
        }

        long result = 0;

        while(start <= end) {
            long mid = start + (end - start)/2;

            if(checkCandies(candies, mid, k)) {
                result = mid;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return (int)result;
    }

     public static boolean checkCandies(int[] candies, long mid, long k) {
        long eatingCandies = 0;
        for(int candy : candies) {
            eatingCandies = eatingCandies  + (candy/mid);
        }

        return eatingCandies >=k;
    }
}