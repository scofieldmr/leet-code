class Solution {
    public int maxArea(int[] height) {

        int left = 0 ;
        int right = height.length - 1;
        int max = Integer.MIN_VALUE;

        while (left < right) {
            int width = right - left;
            int length = Math.min(height[left], height[right]);
            max = Math.max((width * length), max);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;

        // using for loops
    //    int maxWaterArea = Integer.MIN_VALUE;
    //      for(int i=0; i<height.length; i++){
    //          for(int j=i+1; j<height.length; j++){
    //                  int val = Math.min(height[i], height[j]) * (j - i);
    //                  if(val > maxWaterArea) {
    //                      maxWaterArea = val;
    //                  }
    //          }
    //      }
    //      return maxWaterArea;
    }
}