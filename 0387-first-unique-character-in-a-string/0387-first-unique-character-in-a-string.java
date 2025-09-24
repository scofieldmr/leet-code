class Solution {
    public int firstUniqChar(String s) {
        
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            counts[index]++;
        }


        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if(counts[index] == 1){
                return i;
            }
        }

        return -1;
        // Map<Character, Integer> map = new LinkedHashMap<>();
        // for (int i = 0; i < s.length(); i++) {
        //     map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        // }
        // Character ch = null;
        // for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        //     if(entry.getValue() == 1){
        //         ch = entry.getKey();
        //         break;
        //     }
        // }
        // if(ch==null){
        //     return -1;
        // }

        // return s.indexOf(ch);
    }
}