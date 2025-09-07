class Solution {
    public int[] singleNumber(int[] nums) {

        int xor = 0;
        for(int num : nums){
           xor ^= num;
        }


        int diff = xor & (-xor);

        int num1 = 0;
        int num2 = 0;
        for(int num : nums){
            if((num & diff) == 0){
                num2 = (num2 ^ num);
            }
            else{
                num1 = (num1 ^ num);
            }
        }

        return new int [] {num1,num2};

        // Set<Integer> set = new HashSet<>();
        // for (int i = 0; i < nums.length; i++) {
        //     if(!set.add(nums[i])){
        //         set.remove(nums[i]);
        //     }
        // }

        // int[] nums2 = new int[set.size()];
        // int i = 0;

        // Iterator<Integer> it = set.iterator();
        // while (it.hasNext()) {
        //     nums2[i] = it.next();
        //     i++;
        // }

        // return nums2;
        
    }
}