class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));

        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);

        int[] currentInterval = merged.get(0);

        for(int [] interval: intervals){
            if(interval[0]<=currentInterval[1]){
                currentInterval[1] = Math.max(currentInterval[1],interval[1]);
            }
            else{
                currentInterval = interval;
                merged.add(interval);
            }
        }


        int[][] newIntervalMatrix = merged.toArray(new int[merged.size()][]);
        
        
        return newIntervalMatrix;
        
    }
}