class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] newnums = new int[nums.length];

        int j = 1;
        int k = 0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                newnums[i] = nums[j];
                j=j+2;
            }
            else{
                newnums[i] = nums[k];
                k = k+2;
            }
        }

        return newnums;
    }

}