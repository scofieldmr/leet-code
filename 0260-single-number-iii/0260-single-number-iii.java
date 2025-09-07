class Solution {
    public int[] singleNumber(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!set.add(nums[i])){
                set.remove(nums[i]);
            }
        }

        int[] nums2 = new int[set.size()];
        int i = 0;

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            nums2[i] = it.next();
            i++;
        }

        return nums2;
        
    }
}