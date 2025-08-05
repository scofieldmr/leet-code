class Solution {
    public int[] distinctDifferenceArray(int[] nums) {

        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int [] diff = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            Map<Integer,Integer> map = new HashMap<>();
            int prefixCount = 0;
            for(int j=i;j>=0;j--){
                if(map.containsKey(nums[j])){
                    map.put(nums[j],map.get(nums[j])+1);
                }
                else {
                    map.put(nums[j],1);
                }
                if(map.get(nums[j])==1){
                    prefixCount++;
                }
            }
            prefix[i] = prefixCount;

            Map<Integer,Integer> map1 = new HashMap<>();
            int suffixCount = 0;
            for(int j=i+1;j< nums.length;j++){
                if(map1.containsKey(nums[j])){
                    map1.put(nums[j],map1.get(nums[j])+1);
                }
                else {
                    map1.put(nums[j],1);
                }
                if(map1.get(nums[j])==1){
                    suffixCount++;
                }
            }
            suffix[i] = suffixCount;

            diff[i]=prefix[i]-suffix[i];
        }

        return diff;
        
    }
}