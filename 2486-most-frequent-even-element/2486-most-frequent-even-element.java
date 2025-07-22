class Solution {
    public int mostFrequentEven(int[] nums) {


        // Using Tree Map
        Map<Integer, Integer> map = new TreeMap<>();

        for(int i:nums){
            if(i%2==0){
                if(map.containsKey(i)){
                    map.put(i,map.get(i)+1);
                }
                else{
                    map.put(i,1);
                }
            }
        }

        int maxNum = Integer.MIN_VALUE;
        int maxKey = 0;

        if(map.isEmpty()){
            return -1;
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxNum){
                maxNum = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
        
    }
}