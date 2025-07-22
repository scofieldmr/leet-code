class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,(map.get(i))+1);
            }
            else{
                map.put(i,1);
            }
        }
        int max = Integer.MIN_VALUE;
        int maxKey = 0;
        for(Map.Entry<Integer,Integer> m: map.entrySet()){
            if(m.getValue()>max){
                max = m.getValue();
                maxKey = m.getKey();
            }
        }

        return maxKey;
    }
}