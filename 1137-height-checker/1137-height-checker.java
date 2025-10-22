class Solution {
    public int heightChecker(int[] heights) {
        int [] expHeights = heights.clone();
        Arrays.sort(expHeights);
        int count = 0;
        for(int i=0;i<heights.length;i++){
            if(expHeights[i]!=heights[i]){
                count++;
            }
        }

        return count;
    }
}