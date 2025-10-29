class Solution {
    public int findSpecialInteger(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int len = arr.length;
        int len_30 = arr.length/3;

        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }

        int max = Integer.MIN_VALUE;
        int mlen = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getValue()>mlen){
                mlen = m.getValue(); 
                max = m.getKey();
            }
        }

        return max;
    }
}