class Solution {
    public String frequencySort(String s) {
       
        Map<Character,Integer> map = new TreeMap<>();

        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        List<Map.Entry<Character, Integer>> mapList= map.entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getValue)).collect(Collectors.toList());


        StringBuilder builder = new StringBuilder();

        int i = mapList.size()-1;
        for(int j=0;j<mapList.size();j++){
            var a = mapList.get(i);
            for(int k=a.getValue();k>0;k--){
                builder.append(a.getKey());
            }
            i--;
        }

        return builder.toString();

        
        
    }
}