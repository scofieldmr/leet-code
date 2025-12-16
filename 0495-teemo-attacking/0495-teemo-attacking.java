class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {

        int total = 0;

         for (int i = 0; i < timeSeries.length - 1; i++) {
            total += Math.min(duration, timeSeries[i + 1] - timeSeries[i]);
        }
        
        total += duration;

         return total;

        // Set<Integer> set = new HashSet<>();

        // for(int t:timeSeries){
        //     int m = t;
        //     int n = t+duration-1;
        //     for(int i=m;i<=n;i++){
        //         set.add(i);
        //     }
        // }

        // return set.size();
    }
}