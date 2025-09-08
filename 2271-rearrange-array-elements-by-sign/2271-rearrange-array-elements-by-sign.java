class Solution {
    public int[] rearrangeArray(int[] nums) {

        int j = 0;
        int k = 1;
        int [] nums1 = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                nums1[j] = nums[i];
                j = j+2;
            }
            else{
                nums1[k] = nums[i];
                k = k+2;
            }
        }

        return nums1;
        
    }
}