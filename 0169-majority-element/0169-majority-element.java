class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        int max = Integer.MIN_VALUE;
        int maxKey = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
        
    }
}