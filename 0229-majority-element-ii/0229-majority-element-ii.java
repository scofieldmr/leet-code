class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        Map<Integer,Integer> map = new LinkedHashMap<>();
        int len = nums.length;
        int maj = len/3;

        for(int n : nums){
            if(!map.containsKey(n)){
                map.put(n,1);
            }
            else{
                map.put(n,map.get(n)+1);
            }
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