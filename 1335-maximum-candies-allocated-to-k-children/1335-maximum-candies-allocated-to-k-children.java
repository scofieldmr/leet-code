class Solution {
    public int maximumCandies(int[] candies, long k) {

        int start = 1;
        int end = Integer.MIN_VALUE;
        for(int c:candies) {
            end = Math.max(end, c);
        }

        int result = 0;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(checkCandies(candies, mid, k)) {
                result = mid;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return result;
    }

     public static boolean checkCandies(int[] candies, int mid, long k) {
        long eatingCandies = 0;
        for(int candy : candies) {
            eatingCandies = eatingCandies  + (candy/mid);
        }

        return eatingCandies >=k;
    }
}