class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> numList = new ArrayList<>();

        for (int i = 0; i < nums.length-3; i++) {
            int firstNum = nums[i];
            if(i>0 && nums[i-1]==nums[i]){
                continue;
            }
            for (int j = i + 1; j < nums.length-2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                     continue;
                }
                int secondNum = nums[j];
                int left = j+1;
                int right = nums.length-1;
                while (left < right) {
                    long sum = (long) firstNum + secondNum + nums[left] + nums[right];
                    if (sum == target) {
                        List<Integer> list = Arrays.asList(firstNum, secondNum, nums[left], nums [right]);
                        numList.add(list);

                        while(left<right && nums[left] == nums[left+1]) left++;
                        while(left<right && nums[right] == nums[right-1]) right--;

                        left++;
                        right--;
                    }
                    else if (sum > target) {
                        right--;
                    }
                    else {
                        left++;
                    }
                }
            }
        }

        return numList;
    }
}