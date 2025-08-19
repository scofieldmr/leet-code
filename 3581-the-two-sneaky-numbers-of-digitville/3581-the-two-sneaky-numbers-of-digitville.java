class Solution {
    public int[] getSneakyNumbers(int[] nums) {

        int index = 0;

       while (index < nums.length) {
           int correctIndex = nums[index];
           if(nums[correctIndex]!=nums[index]){
               int temp = nums[correctIndex];
               nums[correctIndex] = nums[index];
               nums[index] = temp;
           }
           else{
               index++;
           }
       }
       
       int[] nums1 = new int[2];
       int j=0;
       for(int i = 0; i<nums.length; i++){
            if(i!=nums[i]){
                nums1[j] = nums[i];
                j++;
            }
        }

        return nums1;


        // Set<Integer> set = new HashSet<>();
        // int[] numsCopy = new int[2];
        // int j=0;
        // for(int i = 0; i<nums.length; i++){
        //     if(!set.add(nums[i])){
        //         numsCopy[j] = nums[i];
        //         j++;
        //     }
        // }

        // return numsCopy;
        
    }
}