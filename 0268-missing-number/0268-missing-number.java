class Solution {
    public int missingNumber(int[] nums) {

        int [] nums1 = new int [nums.length+1];
        
        for(int i = 0;i<nums.length;i++){
            int index = nums[i];
            nums1[index] = nums[i];
        }

        for(int i=0;i<nums1.length;i++){
           if(nums1[i]!=i){
             return i;
           }
        }

        return 0;

    //     int index = 0;

    //     while (index < arr.length) {
    //         int correctIndex = arr[index];

    //         if(arr[index] < arr.length && arr[index] != arr[correctIndex]){
    //             int temp = arr[index];
    //             arr[index] = arr[correctIndex];
    //             arr[correctIndex] = temp;
    //         }
    //         else{
    //             index++;
    //         }
    //     }

    //    for (int i = 0; i < arr.length; i++) {
    //        if(arr[i] != i){
    //            return i;
    //        }
    //    }

    //    return arr.length;

        
    }
}