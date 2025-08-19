class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        int index = 0;

        while (index < nums.length) {
            int correctIndex = nums[index]-1;
            if(nums[correctIndex]!=nums[index]){
                int temp = nums[correctIndex];
                nums[correctIndex] = nums[index];
                nums[index] = temp;
            }
            else{
                index++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=(i+1)){
                list.add(nums[i]);
            }
        }

        return list;
        
    }
}