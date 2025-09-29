class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        int result = -1;

        if(bloomDay.length<(m*k)){
            return -1;
        }

        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++) {
            start = Math.min(start,bloomDay[i]);
            end = Math.max(end, bloomDay[i]);
        }

        while(start <= end) {
            int mid = start + (end-start)/2;

            if(isPossible(bloomDay,m,k,mid)){
                 result = mid;
                 end = mid-1;
            }
            else{
               start = mid + 1;
            }
        }
        
        return result;
    }

     public static boolean isPossible(int[] bloomDay,int m,int k,int mid) {
        int flower = 0;
        int bouquet = 0;

        for(int b:bloomDay) {
            if(b <=mid) {
                flower++;
                if(flower == k) {
                    bouquet++;
                    flower = 0;
                }
            }
            else{
                flower = 0;
            }
        }

        return bouquet >= m;
    }
}