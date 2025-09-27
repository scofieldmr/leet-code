class Solution {
    public String frequencySort(String s) {

        Map<Character, Integer> map1= new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map1.containsKey(ch)){
                   map1.put(ch, map1.get(ch)+1);
               }
               else {
                map1.put(ch, 1);
            }
        }
        List<Map.Entry<Character, Integer>> mapList= map1.entrySet().stream()
                 .sorted(Comparator.comparingInt(Map.Entry::getValue)).collect(Collectors.toList());

        StringBuilder builder = new StringBuilder();

        int size=mapList.size()-1;

        for(int j=size; j>=0; j--){
            char ch = mapList.get(j).getKey();
            int count=mapList.get(j).getValue();
            while(count>0){
                builder.append(ch);
                count--;
            }
        }

        return builder.toString();
        // Map<Character, Integer> map1= new HashMap<>();

        // for(int i=0; i<s.length(); i++){
        //     char ch = s.charAt(i);
        //     if(map1.containsKey(ch)){
        //             map1.put(ch, map1.get(ch)+1);
        //         }
        //         else{
        //             map1.put(ch, 1);
        //         }
        // }

        // Map<Character,Integer> newmap1 = map1.entrySet().stream().sorted(Map.Entry.<Character,Integer>comparingByValue().reversed())
        //                 .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));


        // StringBuilder stringBuilder = new StringBuilder();
        // for(Map.Entry<Character,Integer> entry: newmap1.entrySet()){
        //     int count = entry.getValue();
        //     while (count>0){
        //         stringBuilder.append(entry.getKey());
        //         count--;
        //     }
        // }

        // return stringBuilder.toString();
    }
}