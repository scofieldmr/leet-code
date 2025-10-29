class Solution {
    public int singleNumber(int[] nums) {

        int ones = 0;
        int twos = 0;
        for (int n : nums) {
            ones = (ones ^ n) & (~twos);
            twos = (twos ^ n) & (~ones);
        }
        return ones;

        // Map<Integer,Integer> map = new HashMap<>();

        // for(int n :nums){
        //     map.put(n, map.getOrDefault(n,0)+1);
        // }

        // for(Map.Entry<Integer,Integer> m :map.entrySet()){
        //     if(m.getValue()!=3){
        //         return m.getKey();
        //     }
        // }

        // return -1;
    }
}