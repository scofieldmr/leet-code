class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] range  = {-1,-1};
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
           int rem = target-nums[i];

           if(map.containsKey(rem)){
               range[0] = map.get(rem);
               range[1] = i;
               break;
           }
           map.put(nums[i],i);
        }
        return range;

        // int [] range = {-1,-1};
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             range[0] = i;
        //             range[1] = j;
        //             break;
        //         }
        //     }
        // }

        // return range;
        
    }
}