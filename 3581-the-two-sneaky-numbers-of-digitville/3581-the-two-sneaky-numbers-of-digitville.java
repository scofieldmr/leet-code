class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] numsCopy = new int[2];
        int j=0;
        for(int i = 0; i<nums.length; i++){
            if(!set.add(nums[i])){
                numsCopy[j] = nums[i];
                j++;
            }
        }

        return numsCopy;
        
    }
}