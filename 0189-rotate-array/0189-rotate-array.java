class Solution {
    public void rotate(int[] nums, int k) {

        int len = nums.length-1;
        k = k%nums.length;

        rotateArray(nums,0,len);

        rotateArray(nums,0,k-1);

        rotateArray(nums,k,len);
        
        
    }

     static int [] rotateArray(int [] arr, int start, int end){
       
       while(start<end){
          int temp = arr[start];
          arr[start] =arr[end];
          arr[end] = temp;
          start++;
          end--;
       }

      return arr;
       
    }

}

