class Solution {
    public void rotate(int[] nums, int k) {

        int len = nums.length-1;
        k = k%nums.length;

        if(nums.length<2){
            System.out.println(Arrays.toString(nums));
            return;
        }

        rotateArray(nums,0,len);

        rotateArray(nums,0,k-1);

        rotateArray(nums,k,len);
        
        
    }

     static void rotateArray(int [] arr, int start, int end){
       
       while(start<end){
          int temp = arr[start];
          arr[start] =arr[end];
          arr[end] = temp;
          start++;
          end--;
       }

      System.out.println(Arrays.toString(arr));
       
    }

}

