class Solution {
    public int majorityElement(int[] nums) {

        int dup = nums[0];
        int count = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==dup){
                count++;
                continue;
            }
            if(nums[i]!=dup){
                if(count==0){
                    dup=nums[i];
                }
                else{
                    count--;
                }
            }
        }

        return dup;


        //Using Map
        // Map<Integer,Integer> map = new HashMap<>();

        // for(int i:nums){
        //     if(map.containsKey(i)){
        //         map.put(i,(map.get(i))+1);
        //     }
        //     else{
        //         map.put(i,1);
        //     }
        // }
        // int max = Integer.MIN_VALUE;
        // int maxKey = 0;
        // for(Map.Entry<Integer,Integer> m: map.entrySet()){
        //     if(m.getValue()>max){
        //         max = m.getValue();
        //         maxKey = m.getKey();
        //     }
        // }

        // return maxKey;
    }
}