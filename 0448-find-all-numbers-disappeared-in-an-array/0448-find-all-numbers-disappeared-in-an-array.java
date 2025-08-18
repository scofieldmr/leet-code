class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int index = 0;

        while(index < nums.length) {
            int correctIndex = nums[index]-1;

            if(nums[index]!=nums[correctIndex]) {
                int temp = nums[index];
                nums[index] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else {
                index++;
            }
        }

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            int correctValue = i+1;
            if(nums[i]!=correctValue) {
                list.add(correctValue);
            }
        }

        return list;
        
    }
}