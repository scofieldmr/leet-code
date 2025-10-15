class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                i++;
            }
            j++;
        }

        return i;

        // int count = 0;

        // Map<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<g.length;i++){
        //     if(map.containsKey(g[i])){
        //         map.put(g[i],map.get(g[i])+1);
        //     }
        //     else{
        //         map.put(g[i],1);
        //     }
        // }

        // for(int i=0;i<s.length;i++){
        //     if(map.containsKey(s[i])){
        //         map.put(s[i],map.getOrDefault(s[i],0)+1);
        //     }
        //     else{
        //         map.put(s[i],1);
        //     }
        // }

        // for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        //     int value = entry.getValue()/2;
        //     count+=value;
        // }

        // return count;  
    }
}