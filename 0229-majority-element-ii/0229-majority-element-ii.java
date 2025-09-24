class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        Map<Integer,Integer> map = new HashMap<>();
        int len = nums.length;
        int maj = len/3;

        for(int n : nums){
            map.put(n,map.getOrDefault(n,0) + 1);
        }

        List<Integer> list = new ArrayList<>();
    
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>maj){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}